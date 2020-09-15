package com.fqq.javaee.ch02.relation.order;

public class OrderTest {

    public static void main(String[] args) {

         Goods g1 = new Goods("水果",100);
         Goods g2 = new Goods("书本",200);

         Goods []g = {g1,g2};
         Order o = new Order(2,g);
         User u = new User("韩梅梅",o);
         u.apply() ;
    }

}
