package kz.javalab.parser.operation.file;

import java.io.*;

/**
 * Created by HdgDink on 19.07.2017.
 */
public class FileRead {
    private static final String INPUT_FILE_NAME = "in.txt";
    private static final String CHARSET_OF_INPUT_FILE = "UTF-8";

    public String read() {
        int i = 0;
        String text = "";
        InputStreamReader reader = null;
        FileInputStream iFile = null;

        try {
            iFile = new FileInputStream(INPUT_FILE_NAME);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            reader = new InputStreamReader(iFile, CHARSET_OF_INPUT_FILE);
            while ((i = reader.read()) != -1) {
                text += (char) i;
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                iFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return text;
    }
}
