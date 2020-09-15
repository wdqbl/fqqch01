package com.fqq.javaee.ch02.relation.order;
//用户类中有下单的方法（用户姓名和订单号）
public class User  {

    private String name;//用户姓名
    private  Order order;

    public User() {
    }

    public User(String name, Order order) {
        this.name = name;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void apply(){
        System.out.println(this.name +"下单的数量为："+this.order.getNum() );
        order.showOrder() ;
    }

}
