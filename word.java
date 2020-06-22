package com.example.android.miwok;

public class word {
    private String mDefaultTranslation;

    private String mMiwokTtanslation;

    private int mSoundID;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public word(String defaultTranslation, String miwokTtanslation, int sound_id) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTtanslation = miwokTtanslation;
        mSoundID = sound_id;
    }

    public word(String defaultTranslation, String miwokTranslation, int resourceId, int sound_id)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTtanslation = miwokTranslation;
        mImageResourceId = resourceId;
        mSoundID = sound_id;
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

    public int getmAudioResourceID(){
        return mSoundID;
    }
}