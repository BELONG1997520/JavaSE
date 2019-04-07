package com.ltcz99;

public class Human extends Animal {
    private String country;

    public Human(String name,int age,String country){
        super(name, age);
        this.country=country;
    }
    public void say(){
        System.out.println("this is: "+getName()+" I'm:"+getAge()+" from:"+country);
    }
}
