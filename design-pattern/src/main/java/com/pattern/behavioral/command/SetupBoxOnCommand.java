package com.pattern.behavioral.command;

public class SetupBoxOnCommand implements Command{

    SetupBox setupBox;

    public SetupBoxOnCommand(SetupBox setupBox) {
        this.setupBox = setupBox;
    }


    @Override
    public void execute() {
        setupBox.on();
        setupBox.setChannel(5);
        setupBox.setVolume(30);
    }
}
