package com.fqq.javaee.ch02.visible;

public class EmperorTest {

    public static void main(String[] args) {

        Emperor em = new Emperor() ;
        em.setName("秦始皇");
        em.setTime(36);
        em.setAchievements("建立中央集权制度");
        em.setDescription("中国第一个称皇帝的君主") ;

        em.show() ;
    }

}
