package com.fqq.javaee.ch02.extend;

public class Person {

    private String name;
    private int age;
    private boolean gender;
    Person partner;

    public Person() {
    }

    public Person(String name, int age, boolean gender, Person partner) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.partner = partner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }
//下列情况不能结婚：1，同性；2，未达到结婚年龄，男<24，女<22；3，某一方已婚
    public boolean  marry(Person p ) {
        if (this.gender != p.gender && "".equals(this.partner) && "".equals(p.partner)) {
            if ((this.gender && this.age > 23 && p.age < 21) || (!this.gender && this.age > 21 && p.age > 23)) {
                System.out.println(this.name + "和" + p.name + "可以结婚");
                return true;
            } else {
                System.out.println("不能结婚");
            }
        }
    return false;
    }
}
