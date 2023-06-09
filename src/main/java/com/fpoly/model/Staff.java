package com.fpoly.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public class Staff {
    String id;
    @Size(min = 20, message = "{Size.Staff.Fullname}")
    String fullname;
    @Email
    String email;
    Double salary;
    String position;
    String country;
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    
}
