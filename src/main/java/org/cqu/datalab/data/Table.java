package org.cqu.datalab.data;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Table {
    private final File self;
    private final FileInputStream reader;
    private final FileOutputStream writer;

    public Table(File self, FileInputStream reader, FileOutputStream writer) {
        this.self = self;
        this.reader = reader;
        this.writer = writer;
    }

    public boolean insert(List<String> columns) {
        try {
            StringBuilder builder = new StringBuilder();
            for (String column : columns) {
                builder.append(column);
                builder.append(",");
            }
            builder.deleteCharAt(builder.length()-1);
            builder.append("\n");
            writer.write(builder.toString().getBytes(StandardCharsets.UTF_8));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<String> read() {
        Scanner scanner = new Scanner(reader);
        String line = null;
        if (scanner.hasNext()) line = scanner.nextLine();
        if (line != null) return new ArrayList<>(Arrays.asList(line.split(",")));
        else return null;
    }

    public boolean drop() {
        return false;
    }
}
