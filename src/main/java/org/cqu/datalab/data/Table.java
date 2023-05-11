package org.cqu.datalab.data;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Table {
    private static final int SYNC_BOUND_COUNT = 5;
    private final File self;
    private final StringBuffer dataBuffer = new StringBuffer();
    private final FileInputStream inputStream;
    private final int changeCount = 0;

    public Table(File self) throws ExceptionInInitializerError {
        try {
            this.self = self;
            inputStream = new FileInputStream(self);
            loadIntoBuffer();
        } catch (IOException e) {
            throw new ExceptionInInitializerError(e.toString());
        }
    }

    private void loadIntoBuffer() throws IOException{
        byte[] bytes = new byte[512];
        int readBytes = 0;
        while (inputStream.available() > 0) {
            readBytes += inputStream.read(bytes);
            String tmpStr = new String(bytes, 0, readBytes, StandardCharsets.UTF_8);
            dataBuffer.append(tmpStr);
        }
    }

    public void sync() {
        try {
            FileOutputStream outputStream = new FileOutputStream(self);
            outputStream.write(dataBuffer.toString().getBytes(StandardCharsets.UTF_8));
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insert(List<String> columns) {
        try {
            StringBuilder builder = new StringBuilder();
            for (String column : columns) {
                builder.append(column);
                builder.append(",");
            }
            builder.deleteCharAt(builder.length()-1);
            builder.append("\n");
            dataBuffer.append(builder);
            sync();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<String> select(Function<String,String> mapper, Predicate<String> condition) {
        List<String> result = new ArrayList<>();
        Scanner scanner = new Scanner(dataBuffer.toString());
        while (scanner.hasNext()) {
            result.add(scanner.nextLine());
        }
        result = result.stream().filter(condition).map(mapper).collect(Collectors.toList());
        return result;
    }

    public long delete(Predicate<String> condition) {
        List<String> result = new ArrayList<>();
        Scanner scanner = new Scanner(dataBuffer.toString());
        while (scanner.hasNext()) {
            result.add(scanner.nextLine());
        }
        long affectedRows = result.stream().filter(condition).count();
        result.stream().filter(condition)
                .forEach((item) -> {
                    dataBuffer.delete(dataBuffer.indexOf(item), dataBuffer.indexOf("\n", dataBuffer.indexOf(item))+1);
                });
        sync();
        return affectedRows;
    }

    public long update(Map<Integer, String> assignList, Predicate<String> condition) {
        List<String> result = new ArrayList<>();
        Scanner scanner = new Scanner(dataBuffer.toString());
        while (scanner.hasNext()) {
            result.add(scanner.nextLine());
        }
        long affectedRows = result.stream().filter(condition).count();
        result.stream().filter(condition)
                .forEach((line) -> {
                    int startIndex = dataBuffer.indexOf(line);
                    dataBuffer.delete(startIndex, dataBuffer.indexOf("\n", startIndex)+1);
                    String[] elements = line.split(",");
                    assignList.forEach((key, value) -> elements[key] = value);
                    StringBuilder builder = new StringBuilder();
                    for (String element : elements) {
                        builder.append(element);
                        builder.append(",");
                    }
                    builder.deleteCharAt(builder.length()-1);
                    builder.append("\n");
                    dataBuffer.insert(startIndex, builder);
                });
        sync();
        return affectedRows;
    }
}
