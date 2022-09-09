package com.pattern.behavioral.command;

public class Main {
    public static void main(String[] args) {
        RemoteControl rs = new RemoteControl();//Remote command is not dependent on Tv or Setupbox
        SetupBox setupBox = new SetupBox();
        rs.setCommand(new SetupBoxOnCommand(setupBox));
        rs.pressButton();

        rs.setCommand(new SetupBoxOffCommand(setupBox));
        rs.pressButton();
        System.out.println("*****************");
        Tv tv = new Tv();
        rs.setCommand(new TvOnCommand(tv));
        rs.pressButton();

        rs.setCommand(new TvOffCommand(tv));
        rs.pressButton();


    }
}
