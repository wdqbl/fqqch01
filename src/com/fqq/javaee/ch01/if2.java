package com.fqq.javaee.ch01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class if2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您哪天订票：");
        double d = scanner .nextDouble() ;
        double price = 1300;
        if((d<=1.03&&d>=1.01)||(d<=5.03&&d>=5.01)||(d<=10.07&&d>=10.01)){
            price = 1300;
        }else{

             price=1300*0.8;
        }

        System.out.println("应付："+price);
    }
}


