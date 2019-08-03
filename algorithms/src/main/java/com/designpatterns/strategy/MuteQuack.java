package com.designpatterns.strategy;

public class MuteQuack implements IQuackBehaviour {

    public void quack() {
        System.out.println("I do not quack");
    }
}
