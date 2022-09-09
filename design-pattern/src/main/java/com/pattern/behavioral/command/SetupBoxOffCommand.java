package com.pattern.behavioral.command;

public class SetupBoxOffCommand implements Command{

    SetupBox setupBox;

    public SetupBoxOffCommand(SetupBox setupBox) {
        this.setupBox = setupBox;
    }


    @Override
    public void execute() {
        setupBox.off();

    }
}
