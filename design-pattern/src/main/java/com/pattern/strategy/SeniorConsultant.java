package com.pattern.strategy;

public class SeniorConsultant implements Role{
    @Override
    public String description() {
        return SeniorConsultant.class.getName();
    }

    @Override
    public String reposibilities() {
        return " review coding.";
    }
}
