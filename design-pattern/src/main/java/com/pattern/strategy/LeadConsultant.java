package com.pattern.strategy;

public class LeadConsultant implements Role{
    @Override
    public String description() {
        return LeadConsultant.class.getName();
    }

    @Override
    public String reposibilities() {
        return " design review coding.";
    }
}
