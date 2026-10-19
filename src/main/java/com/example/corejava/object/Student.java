package com.example.corejava.object;

import java.util.Arrays;

public class Student extends Person{
    private String nameSchool;
    private int point;
    private String[] subject;

    public Student(String nameSchool, int point, String[] subject) {
        this.nameSchool = nameSchool;
        this.point = point;
        this.subject = subject;
    }

    public Student(String name, int age, String address, String nameSchool, int point, String[] subject) {
        super(name, age, address);
        this.nameSchool = nameSchool;
        this.point = point;
        this.subject = subject;
    }

    public Student(){}

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSchool='" + nameSchool + '\'' +
                ", point=" + point +
                ", subject=" + Arrays.toString(subject) +
                '}';
    }
}
