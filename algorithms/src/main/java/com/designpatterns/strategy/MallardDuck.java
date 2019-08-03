package com.designpatterns.strategy;

public class MallardDuck extends Duck {


    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("I am Mallard Duck");
    }
}
