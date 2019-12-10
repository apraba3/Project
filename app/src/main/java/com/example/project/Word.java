package com.example.project;



public class Word {
    private String eng;
    private String trans;
    private int imageId;

    public Word(String english, String translation) {
        this.eng = english;
        this.trans = translation;
    }

    public Word(String english, String translation, int imageId) {
        this.eng = english;
        this.trans = translation;
        this.imageId = imageId;
    }

    public String getEnglish() {
        return eng;
    }

    public void setEnglish(String english) {
        this.eng = english;
    }

    public String getTranslation() {
        return trans;
    }

    public void setTranslation(String translation) {
        this.trans = translation;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int image) {
        imageId = image;
    }
}
