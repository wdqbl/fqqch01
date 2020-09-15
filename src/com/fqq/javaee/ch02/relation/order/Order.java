package com.fqq.javaee.ch02.relation.order;
//1.一个订单会有几个货物（一对多的关系）,订单中一个方法（查看商品详情信息）
public class Order {

     private int num;//订单数量
    private String label;//订单种类

    private Goods goods;

    public Order() {
    }

    public Order(int num, String label, Goods goods) {
        this.num = num;
        this.label = label;
        this.goods = goods;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public void show(){
        System.out.println("订单种类:"+label );
        System.out.println("订单数量："+num );
        goods.show() ;
    }
}
