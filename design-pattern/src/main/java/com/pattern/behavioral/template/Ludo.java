package com.pattern.behavioral.template;

public class Ludo implements Game{

    @Override
    public void initialize() {
        System.out.println("Ludo Game Initialized! Start playing.");
    }

    @Override
    public void start() {
        System.out.println("Game Started. Welcome to in the Ludo game!");
    }

    @Override
    public void end() {
        System.out.println("Game Finished!");
    }
}