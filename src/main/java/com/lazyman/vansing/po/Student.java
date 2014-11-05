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

    @Column(length = 60)
    private String school;

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
}
