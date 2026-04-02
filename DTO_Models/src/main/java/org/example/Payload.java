package org.example;

public class Payload {
    String text;

    public Payload(String text)
    {
        this.text=text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
