package com.workintech.developers;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() * 2);
        System.out.println(getName() + " " + getSalary() + " maaşla Sr. Developer olarak başladı.");
    }

}
