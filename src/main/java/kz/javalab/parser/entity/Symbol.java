package kz.javalab.parser.entity;

/**
 * Created by HdgDink on 19.07.2017.
 */
public class Symbol implements TextPart {
    char ch;

    public Symbol(char ch) {
        this.ch = ch;
    }

    public void addElement(TextPart part) {

    }

    @Override
    public String toString() {
        return String.valueOf(ch);
    }
}
