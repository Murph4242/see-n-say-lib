package com.biw.asg.lib;

public abstract class Animal implements SeeNSay {
    public abstract String makeSound();

    @Override
    public String speak() {
        return "A " + this.getClass().getSimpleName() + " says, " + makeSound();
    }
}