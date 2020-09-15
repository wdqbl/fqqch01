package com.fqq.javaee.ch01;


import java.util.Scanner;

public class for2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入金字塔层数：");
        int n=scanner .nextInt() ;
        for(int i=1;i<=n;i++){
            //根据外层行号，输出星号左边空格
            for(int j=1;j<=n-i;j++)
                System.out.println(" ");
            for(int k=1;k<=2*i-1;k++)
                System.out.println("*");
            System.out.println("\n");
        }
    }
}
