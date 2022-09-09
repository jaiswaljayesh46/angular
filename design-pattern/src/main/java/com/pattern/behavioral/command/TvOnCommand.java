package com.pattern.behavioral.command;

public class TvOnCommand implements Command{

    Tv tv;

    public TvOnCommand(Tv tv) {
        this.tv = tv;
    }


    @Override
    public void execute() {
        tv.on();

    }
}
