package com.makaji.aleksej.customanotationaspectj;

/**
 * Created by Aleksej on 9/13/2017.
 */

public class Student {

    public String name;
    public String lastName;

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
