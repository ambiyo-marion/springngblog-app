package com.company;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(int size, String name, int eyes, int legs, int teeth,int tail,String coat,int weight) {
        super(1, name, 1,size ,weight);
        this.coat = coat;
        this.eyes = eyes;
        this.tail = tail;
        this.teeth = teeth;
        this.legs = legs;
    }
    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat()called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk()called");
        move(5);
    }
    public void  run(){
        System.out.println("Dog.run()called");
        move(10);
    }
}
