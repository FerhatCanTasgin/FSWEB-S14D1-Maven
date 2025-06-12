package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() * 1.05);
        System.out.println(getName() + " " + getSalary() + " maaşla JR. Developer olarak başladı.");
    }
}

