package com.example.phamn.learningtoeic.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Title implements Serializable{
    @SerializedName("titleName") private String titleName;
    @SerializedName("partName") private String partName;
    @SerializedName("audio") private String audio;
    @SerializedName("time") private String time;
    @SerializedName("numberOfQuestions") private int numberOfQuestions;

    public Title() {
    }

    public Title(String titleName, String partName, String audio, String time, int numberOfQuestions) {
        this.titleName = titleName;
        this.partName = partName;
        this.audio = audio;
        this.time = time;
        this.numberOfQuestions = numberOfQuestions;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }
}