package com.hpdeveloper.recyclerview.entities;

import java.io.Serializable;

/**
 * Created by hiren.patel on 27-11-2015.
 */
public class Student implements Serializable {

    private String name;

    private String emailId;

    public Student(String name, String emailId) {
        this.name = name;
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

}
