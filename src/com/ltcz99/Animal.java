package com.ltcz99;

public class Animal implements Talking{
    private String name;
    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(){
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }

    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void say(){
        System.out.println("this a animal: "+getName()+" he is:"+getAge());
    }

}
