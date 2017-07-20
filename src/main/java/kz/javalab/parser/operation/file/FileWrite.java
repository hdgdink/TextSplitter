package kz.javalab.parser.operation.file;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by HdgDink on 19.07.2017.
 */
public class FileWrite {
    private static final String OUTPUT_FILE_NAME = "out.txt";


    public void write(String text) {
        FileWriter writer = null;

        try {
            writer = new FileWriter(OUTPUT_FILE_NAME);
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
