package com.fqq.javaee.ch01;


import java.util.Scanner;

public class switch1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学员成绩：");
        int score = scanner.nextInt() ;
        int n = score/10;

        switch (n){
            case(10):
            case(9):
                System.out.println("A");
                break;
            case(8):
                System.out.println("B");
                break;
            case(7):
                System.out.println("C");
                break;
            case(6):
                System.out.println("D");
            case(5):
            case(4):
            case(3):
            case(2):
            case(1):
            case(0):
                System.out.println("不及格");
             break;

        }

    }

}
