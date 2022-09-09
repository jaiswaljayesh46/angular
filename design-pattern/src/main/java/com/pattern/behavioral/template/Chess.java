package com.pattern.behavioral.template;

public class Chess  implements Game{

    @Override
    public void initialize() {
        System.out.println("Chess Game Initialized! Start playing.");
    }
    @Override
    public void start() {
        System.out.println("Game Started. Welcome to in the chess game!");
    }
    @Override
    public void end() {
        System.out.println("Game Finished!");
    }
}
