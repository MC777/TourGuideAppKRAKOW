package com.example.mck.tourguideapp_krakow;

public class Word {

    /** String resource ID for the default first line */
    private int mDefaultFirstLineId;

    /** String resource ID for the second line */
    private int mSecondLineId;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param defaultTFirstLineId is the string resource ID for the first line
     * @param secondLineId is the string resource Id for the second line
     */
    public Word(int defaultTFirstLineId, int secondLineId) {
        mDefaultFirstLineId = defaultTFirstLineId;
        mSecondLineId = secondLineId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTFirstLineId is the string resource ID for the first line
     * @param secondLineId is the string resource Id for the second line
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    public Word(int defaultTFirstLineId, int secondLineId, int imageResourceId) {
        mDefaultFirstLineId = defaultTFirstLineId;
        mSecondLineId = secondLineId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the first line
     */
    public int getDefaultFirstLine() {
        return mDefaultFirstLineId;
    }

    /**
     * Get the string resource ID for the second line
     */
    public int getSecondLineId() {
        return mSecondLineId;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
