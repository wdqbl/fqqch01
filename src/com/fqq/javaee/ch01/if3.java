package com.fqq.javaee.ch01;

import java.util.Scanner;

public class if3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入性别：");
        String sex = sc.next() ;
        System.out.println("请输入身高：");
        int h = sc.nextInt() ;
        System.out.println("请输入年龄：");
        int age = sc.nextInt() ;

        if(sex.equals("男")&&h>170&& age>=20&&age<=26){

                    System.out.println("可以应征入伍！");
        }
        else if (sex.equals("女")&&h>162&& age>=20&&age<=22){
                    System.out.println("可以应征入伍！");
        }
        else{
                    System.out.println("不可以应征入伍！");
        }
           
    }

}
