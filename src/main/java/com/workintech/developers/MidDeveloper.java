package com.workintech.developers;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() * 1.50);
        System.out.println(getName() + " " + getSalary() + " maaşla Mid Developer olarak başladı.");
    }
}
