package com.makaji.aleksej.customannotation.internal;

/**
 * Created by Aleksej on 9/13/2017.
 */

public class StudentAn {

    public String name;
    public String lastName;

    public StudentAn(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public StudentAn() {
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
