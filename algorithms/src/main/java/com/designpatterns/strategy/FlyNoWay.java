package com.designpatterns.strategy;

public class FlyNoWay implements IFlyBehaviour {

    public void fly(){
        System.out.println("I can not fly");
    }
}
