package com.company;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(int body,String name,int brain,int size, int weight) {
        this.body = body;
        this.brain= brain;
        this.name = name;
        this.size = size;
        this.weight = weight;
    }
    public void eat(){
        System.out.println("Animal.eat() called");
    }
    public void move(int speed){
        System.out.println("Animal.move()called.Animal was moving at " + speed);
    }

    public int getBody() {
        return body;
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}