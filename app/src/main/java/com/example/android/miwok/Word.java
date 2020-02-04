package com.example.android.miwok;

public class Word {
    private String miwokTranslation;
    private String defaultTranslation;
    private int imageResourceId;
    private int rawResourceId;

    public Word(String miwokTranslation, String defaultTranslation, int rawResourceId) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.rawResourceId = rawResourceId;
    }

    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId, int rawResourceId) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imageResourceId = imageResourceId;
        this.rawResourceId = rawResourceId;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public int getImageResourceIdID() {
        return imageResourceId;
    }

    public int getRawResourceId() {
        return rawResourceId;
    }
}
