package com.fqq.javaee.ch02.relation.order;
//1.一个订单会有几个货物（一对多的关系）,订单中一个方法（查看商品详情信息）
public class Order {

    private int num;//订单数量


    private Goods[] goods = new Goods[2];

    public Order() {
    }

    public Order(int num,   Goods[] goods) {
        this.num = num;

        this.goods = goods;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Goods[] getGoods() {
        return goods;
    }

    public void setGoods(Goods[] goods) {
        this.goods = goods;
    }

    public void showOrder(){
        System.out.println("订单数量："+num );
        System.out.println("===========订单信息==============");
        for(Goods goods : this.goods ){
            goods.showGoods() ;
        }
    }
}
