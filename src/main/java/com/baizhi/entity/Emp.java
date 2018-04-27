package com.baizhi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Emp implements Serializable {
    private String id;

    private String name;

    private BigDecimal salary;

    private Integer age;

    private Date birthday;

    private String did;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }
}