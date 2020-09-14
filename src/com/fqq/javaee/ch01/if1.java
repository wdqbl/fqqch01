package com.fqq.javaee.ch01;

import java.util.Scanner;

public class if1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = scanner.nextInt() ;
        System.out.println("a="+a);
        System.out.println("请输入第二个数字：");
        int b = scanner .nextInt() ;
        System.out.println("b="+b);
        System.out.println("请输入一个运算符号：");
        String str = scanner.next() ;

        int c = 0;

        if(str.equals("+")){
            c=a+b;
        }
        else if(str.equals("-") ){
            c=a-b;
        }
        else if(str.equals("*") ){
            c=a*b;
        }
        else if(str.equals("/") ){
            c=a/b;
        }

        System.out.println("结果："+a+str+b+"="+c);

    }

}
