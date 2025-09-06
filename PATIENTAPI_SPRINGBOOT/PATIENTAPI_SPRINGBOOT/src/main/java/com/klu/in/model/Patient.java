package com.klu.in.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient_table")
public class Patient {
    @Id
    @Column(name = "patient_id")
    private int id;
    
    @Column(name = "patient_name", nullable = false, length = 50)
    private String name;
    
    @Column(name = "patient_gender", nullable = false, length = 10)
    private String gender;
    
    @Column(name = "patient_age", nullable = false)
    private int age;
    
    @Column(name = "patient_blood_group", nullable = false, length = 10)
    private String bloodGroup;
    
    @Column(name = "patient_email", nullable = false, unique = true, length = 50)
    private String email;
    
    @Column(name = "patient_password", nullable = false, length = 50)
    private String password;
    
    @Column(name = "patient_contact", nullable = false, unique = true, length = 20)
    private String contact;
    
    @Column(name = "patient_address", nullable = false, length = 100)
    private String address;

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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getBloodGroup() {
        return bloodGroup;
    }
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Patient [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", bloodGroup=" + bloodGroup
                + ", email=" + email + ", password=" + password + ", contact=" + contact + ", address=" + address + "]";
    }
}
