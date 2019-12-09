package com.example.project;

/**
 * Created by Shrey Patel on 2018-02-24.
 * This class contains the word object which will contain the word in English and all of the translations
 */

public class Word {
    private String english;
    private String translation;
    private int imageId;

    public Word(String english, String translation) {
        this.english = english;
        this.translation = translation;
    }

    public Word(String english, String translation, int imageId) {
        this.english = english;
        this.translation = translation;
        this.imageId = imageId;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int image) {
        imageId = image;
    }
}
