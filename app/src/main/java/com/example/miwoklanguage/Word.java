package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

//    Miwok image id for the app
    private int mImageResourceId=-1;

    private int mAudioResourceId;
    private static final int No_Image_provided=-1;
    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation,int audioresource) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId=audioresource;
    }

//    @Override
//    public String toString() {
//        return "Word{" +
//                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
//                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
//                ", mImageResourceId=" + mImageResourceId +
//                ", mAudioResourceId=" + mAudioResourceId +
//                '}';
//    }

    //Constructor overloading
    public Word(String defaultTranslation, String miwokTranslation,int Image_id,int audioresource)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId=Image_id;
        mAudioResourceId=audioresource;
    }
    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }


    public int getmImageIdResource(){return mImageResourceId;}

//  public int getColor_id(){return Color_id;}

    public boolean hasImage(){
        return No_Image_provided!=mImageResourceId;
    }


    public int getmAudioResourceId(){
        return mAudioResourceId;
    }
}