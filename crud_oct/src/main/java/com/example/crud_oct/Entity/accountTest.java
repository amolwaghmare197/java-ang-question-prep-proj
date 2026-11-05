package com.example.crud_oct.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class accountTest implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String fname;
    private String lname;
    private String number;
    private LocalDateTime updatedAt;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public accountTest( String fname, String lname, String number, LocalDateTime updatedAt) {
        this.fname = fname;
        this.lname = lname;
        this.number = number;
        this.updatedAt = updatedAt;
    }

    public accountTest() {
    }

    @Override
    public String toString() {
        return "accountTest{" +
                "Id=" + Id +
                ", fname='" + fname + '\'' +
                ", Lname='" + lname + '\'' +
                ", number='" + number + '\'' +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
