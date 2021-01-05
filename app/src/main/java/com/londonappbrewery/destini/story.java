package com.londonappbrewery.destini;


public class story {
    private  int mStory;
    private int mTopOption;
    private int mBottomOption;
    public story(int StoryID, int topOption, int bottomOption) {
        mStory = StoryID;
        mTopOption = topOption;
        mBottomOption = bottomOption;
    }

    public int getStory() {
        return mStory;
    }

    public void setStory(int story) {
        mStory = story;
    }

    public int getTopOption() {
        return mTopOption;
    }

    public void setTopOption(int topOption) {
        mTopOption = topOption;
    }

    public int getBottomOption() {
        return mBottomOption;
    }

    public void setBottomOption(int bottomOption) {
        mBottomOption = bottomOption;
    }
}
