package com.pattern.strategy;

public class PrincipalConsultant implements Role{
    @Override
    public String description() {
        return PrincipalConsultant.class.getName();
    }

    @Override
    public String reposibilities() {
        return " design coding.";
    }
}
