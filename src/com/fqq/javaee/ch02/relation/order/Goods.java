package com.fqq.javaee.ch02.relation.order;

public class Goods {

    private String label;
    private int num;

    public Goods() {
    }

    public Goods(String label, int num) {
        this.label = label;
        this.num = num;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void showGoods(){

        System.out.println("货物种类："+label);
        System.out.println("货物数量："+num );

    }

}

