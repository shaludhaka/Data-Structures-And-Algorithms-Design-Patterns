package com.designpatterns.strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        System.out.println("For Mallard Duck");
        MallardDuck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("\nFor Model Duck");
        Duck model = new ModelDuck();
        model.performQuack();
        //It will perform no fly
        model.performFly();
        //set the duck fly behaviour on runtime with a new bahavior called RocketPoweredBehaviour
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();



    }
}
