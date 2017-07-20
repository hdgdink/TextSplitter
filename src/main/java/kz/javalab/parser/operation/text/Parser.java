package kz.javalab.parser.operation.text;

import kz.javalab.parser.entity.Composite;
import kz.javalab.parser.entity.Symbol;

/**
 * Created by HdgDink on 19.07.2017.
 */
public class Parser {
    private static final String SPLIT_INTO_PARAGRAPHS = "(\\\\s*(.+))";
    private static final String SPLIT_INTO_SENTENCES = "(\\\\.\\\\?\\\\!\\\\;\\\\...)";
    private static final String SPLIT_INTO_WORDS = "(\\\\s\\\\,)";

    public Composite parseText(String inText) {
        Composite text = new Composite();
        String[] paragraphs = inText.split(SPLIT_INTO_PARAGRAPHS);

        for (String paragraph : paragraphs)
            text.addElement(parseParagraph(paragraph));
        return text;
    }

    private Composite parseParagraph(String inText) {
        Composite paragraph = new Composite();
        String[] sentences = inText.split(SPLIT_INTO_SENTENCES);

        for (String sentence : sentences)
            paragraph.addElement(parseSentence(sentence));
        return paragraph;
    }

    private Composite parseSentence(String inText) {
        Composite sentence = new Composite();
        String[] words = inText.split(SPLIT_INTO_WORDS);

        for (String word : words)
            sentence.addElement(parseWord(word));
        return sentence;
    }

    private Composite parseWord(String inText) {
        Composite word = new Composite();

        for (char ch : inText.toCharArray())
            word.addElement(new Symbol(ch));
        return word;
    }

}


