package com.example.android.miwok;

public class word {
    private String mDefaultTranslation;

    private String mMiwokTtanslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public word(String defaultTranslation, String miwokTtanslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTtanslation = miwokTtanslation;
    }

    public word(String defaultTranslation, String miwokTranslation, int resourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTtanslation = miwokTranslation;
        mImageResourceId = resourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTtanslation;
    }

    public int getImageResourceID(){
        return mImageResourceId;
    }

    public boolean hasImage()
    {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}