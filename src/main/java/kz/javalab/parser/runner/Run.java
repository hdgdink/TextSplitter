package kz.javalab.parser.runner;

import kz.javalab.parser.operation.file.FileRead;
import kz.javalab.parser.operation.file.FileWrite;
import kz.javalab.parser.operation.text.Modify;
import kz.javalab.parser.operation.text.Parser;

/**
 * Created by HdgDink on 18.07.2017.
 */


public class Run {
    public static void main(String[] args) {
        FileRead reader = new FileRead();
        FileWrite writer = new FileWrite();
        Parser parser = new Parser();
        writer.write(parser.parseText(reader.read()).toString());

        Modify modder = new Modify();
        System.out.println(modder.textMod(parser.parseText(reader.read()).toString()));

    }
}
