package com.pattern.strategy;

public class Consultant implements Role{
    @Override
    public String description() {
        return Consultant.class.getName();
    }

    @Override
    public String reposibilities() {
        return " do coding.";
    }
}
