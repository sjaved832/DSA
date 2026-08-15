package com.codewithjaveed.designpatterns.momento;

public class Originator {

    private String content;
    private String fontSize;
    private String fontName;

    public Momento saveStateToMomento() {
        return new Momento(content, fontSize, fontName);
    }

    public void getStateFromMomento(Momento state) {
        content = state.getContent();
        fontSize = state.getFontSize();
        fontName = state.getFontName();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    @Override
    public String toString() {
        return getContent() +" "+ getFontSize() +" "+ getFontName();
    }
}

