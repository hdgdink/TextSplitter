package kz.javalab.parser.operation.text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by HdgDink on 20.07.2017.
 * В тексте после k-го символа вставить заданную подстроку
 */
public class Modify {
    private static final String SUBSTRING_FOR_INSERTING = "\"I inserted this substring after the specified character\"";
    private static final String ENTER_INDEX = "Enter index of char";
    private static final String WRONG_INDEX = "Entered character index is missing";
    private int charIndex;
    private boolean check = false;
    private String modText = "";

    public String textMod(String inText) {
        Scanner reader = new Scanner(System.in);
        System.out.println(ENTER_INDEX);

        while (!check) {
            if (reader.hasNextInt() & charIndex <= inText.length()) {
                charIndex = reader.nextInt();
                modText = String.valueOf(new StringBuffer(inText).insert(charIndex, SUBSTRING_FOR_INSERTING).toString());
                reader.close();
                check = true;
            } else {
                System.out.println(WRONG_INDEX);
                reader.next();
                check = false;
            }
        }
        return modText;
    }

}
