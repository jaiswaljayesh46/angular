package com.pattern.behavioral.template;

public interface Game {
    void initialize();
    void start();
    void end();

    public default void play() {

        //initialize the game
        initialize();

        //start game
        start();

        //end game
        end();
    }
}
