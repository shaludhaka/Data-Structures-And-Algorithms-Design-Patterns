package com.designpatterns.strategy;

public abstract class Duck {

    IFlyBehaviour flyBehaviour;
    IQuackBehaviour quackBehaviour;

    public Duck() {

    }


    public abstract void display();


    public void swim() {
        System.out.println("All can swim");
    }


    public void performFly() {
        flyBehaviour.fly();
    }


    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(IFlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(IQuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
