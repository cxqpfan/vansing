package com.lazyman.vansing.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * User: APPLE
 * Date: 11/5/14
 */
@Entity
public class Student {

    @Id
    @Column(length = 30)
    private String name;

    @Column
    private int grade;

    @Column(length = 60)
    private String school;

    @Column(length = 15)
    private String phone;

    @Column(length = 30)
    private String email;

    @Column(length = 60)
    private String address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
