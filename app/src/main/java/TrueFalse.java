package com.londonappbrewery.quizzler;




class TrueFalse {

    public int getQuestionID;
    private int mQuestion;
    private boolean mAnswer;

    TrueFalse(int questionResourceID, boolean trueOrFalse){

        mQuestion = questionResourceID;
        mAnswer = trueOrFalse;

    }

    public int getQuestionID() {
        return mQuestion;
    }

    public void setQuestionID(int questionID) {
        mQuestion = questionID;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
