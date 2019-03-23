package com.headfirst.patterns.introStrategyPattern.solution;

/**
 * Created by adarshbhattarai on 3/22/19.
 */
public abstract  class Duck {
    void swim(){

        System.out.println("Duck  , I swim");
    }
    abstract void display();

    public void performQuack(){
        quackingBehaviour.quack();
    }

    public void performFly(){
        flyingBehaviour.fly();
    }

    public void setFlyingBehaviour(FlyingBehaviour fb){
        flyingBehaviour=fb;
    }

    public void setQuackingBehaviour(QuackingBehaviour qc){
        quackingBehaviour=qc;
    }
    FlyingBehaviour flyingBehaviour;
    QuackingBehaviour quackingBehaviour;
}
