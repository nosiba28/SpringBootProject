package com.example.Springboot1.student;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table
public class Student {

    @Id
    private Integer id;
    private String name;
    private String gender;
    private String email;
    private LocalDate dob;

    public Student() {
    }

    public Student(int id, String name, String gender, String email, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.dob = dob;
    }
    public Student( String name, String gender, String email, LocalDate dob) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                '}';
    }
}