package com.example.corejava.object;

public class Employee extends Person{
    private String nameCompany;
    private int salary;

    public Employee(String nameCompany, int salary) {
        this.nameCompany = nameCompany;
        this.salary = salary;
    }

    public Employee(String name, int age, String address, String nameCompany, int salary) {
        super(name, age, address);
        this.nameCompany = nameCompany;
        this.salary = salary;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nameCompany='" + nameCompany + '\'' +
                ", salary=" + salary +
                '}';
    }
}
