package com.example.entity;


import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    @ElementCollection
    private List<String> familyMembers;
    public Long getId() { 
    	return id;
    	}
    public void setId(Long id) { 
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
    
    public String getPhoneNumber() {
    	return phoneNumber;
    	}
    public void setPhoneNumber(String phoneNumber) {
    	this.phoneNumber = phoneNumber;
    	}
    
    public List<String> getFamilyMembers() {
    	return familyMembers;
    	}
    public void setFamilyMembers(List<String> familyMembers) { 
    	this.familyMembers = familyMembers; 
    	}
}
