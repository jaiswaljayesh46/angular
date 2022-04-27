package com.pattern.strategy;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alyx",new Consultant());
        Employee emp2 = new Employee("Bob",new SeniorConsultant());

        System.out.println("before promotion");
        emp1.doWork();
        emp2.doWork();

        System.out.println("after promotion");
        emp1.promote(new SeniorConsultant());
        emp2.promote(new PrincipalConsultant());

        emp1.doWork();
        emp2.doWork();
    }
}

/*
======o/p=========
before promotion
Alyx--> do coding.
Bob--> review coding.
after promotion
Alyx--> review coding.
Bob--> design coding.
 */
