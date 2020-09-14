package com.fqq.javaee.ch01;

import java.util.Scanner;

public class for1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数字：");
        int a = scanner .nextInt() ;
        int b = (int)(Math.random()*100+1) ;

        int count = 1;
        for(int i=0;i<7;i++){
            if(a<b){
                System.out.println("太小了，再大一点！");
                System.out.println("请重新输入：");
                a = scanner .nextInt() ;
                count ++;
            }
            else if(a == b ){
                System.out.println("恭喜你猜对了！");
                break;
            }
            else if(a>b){
                System.out.println("太大了，再小一点！");
                System.out.println("请重新输入：");
                a = scanner .nextInt() ;
                count++;
            }
        }
        if(count == 7) {
            System.out.println("你太笨了，下次再来吧！");
            System.out.println("b = "+b);
        }

    }

}
