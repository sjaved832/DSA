package com.codewithjaveed.designpatterns.momento;

public class Momento {
    private final String content;
    private final String fontSize;
    private final String fontName;

    public Momento(String content, String fontSize, String fontName) {
        this.content = content;
        this.fontSize = fontSize;
        this.fontName = fontName;
    }

    public String getContent() {
        return content;
    }

    public String getFontSize() {
        return fontSize;
    }

    public String getFontName() {
        return fontName;
    }
}
