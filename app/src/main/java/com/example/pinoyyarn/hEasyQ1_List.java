package com.example.pinoyyarn;

public class hEasyQ1_List {
    String question;
    String optionA, optionB, optionC, optionD;
    int correctAns;

    public String getQuestion() {
        return question;
    }

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public int getCorrectAns() {
        return correctAns;
    }

    public hEasyQ1_List(String question, String optionA, String optionB, String optionC, String optionD, int correctAns) {
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctAns = correctAns;
    }
}
