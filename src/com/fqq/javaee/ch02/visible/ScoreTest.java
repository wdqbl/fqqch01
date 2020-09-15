package com.fqq.javaee.ch02.visible;

public class ScoreTest {

    public static void main(String[] args) {
        Score score = new Score();
        score.setCsScore(44);
        score.setJavaScore(88);
        score.setDbScore(67);


        score .Average() ;
        score.sum() ;
    }

}
