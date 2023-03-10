package com.app.candidate.Entity;

import javax.persistence.*;

@Entity
@Table(name = "candidate")
public class Candidate {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String cv;

    public Candidate(){
    }

    public Candidate(Integer id, String firstName, String lastName, String email, String cv) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.cv = cv;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }
}
