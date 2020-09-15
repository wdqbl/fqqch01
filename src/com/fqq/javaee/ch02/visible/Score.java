package com.fqq.javaee.ch02.visible;

public class Score {

    private float javaScore;
    private float csScore;
    private float dbScore;

    public Score(float javaScore, float csScore, float dbScore) {
        this.javaScore = javaScore;
        this.csScore = csScore;
        this.dbScore = dbScore;
    }

    public Score() {
    }

    public float getJavaScore() {
        return javaScore;
    }

    public void setJavaScore(float javaScore) {
        this.javaScore = javaScore;
    }

    public float getCsScore() {
        return csScore;
    }

    public void setCsScore(float csScore) {
        this.csScore = csScore;
    }

    public float getDbScore() {
        return dbScore;
    }

    public void setDbScore(float dbScore) {
        this.dbScore = dbScore;
    }



}
