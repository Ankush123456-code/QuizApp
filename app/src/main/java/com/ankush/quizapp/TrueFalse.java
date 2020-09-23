package com.ankush.quizapp;

public class TrueFalse {
    private int mquestionid;
    private boolean manswer;

    public TrueFalse(int mquestionid, boolean manswer) {
        this.mquestionid = mquestionid;
        this.manswer = manswer;
    }

    public void setMquestionid(int mquestionid) {
        this.mquestionid = mquestionid;
    }

    public void setManswer(boolean manswer) {
        this.manswer = manswer;
    }

    public int getMquestionid() {
        return mquestionid;
    }

    public boolean isManswer() {
        return manswer;
    }
}
