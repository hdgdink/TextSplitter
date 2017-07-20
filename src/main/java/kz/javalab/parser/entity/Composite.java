package kz.javalab.parser.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HdgDink on 19.07.2017.
 */
public class Composite implements TextPart {
    List<TextPart> components = new ArrayList<TextPart>();


    public void addElement(TextPart part) {
        components.add(part);
    }

    @Override
    public String toString() {
        String st = "";
        for (TextPart component : components)
            st += component.toString();
        return st;
    }
}

