package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String booktitle;
    private Double bookprice;
    private Integer bookquantity;

    
    public Long getId() {
    	return id; 
    	}
    public void setId(Long id) { 
    	this.id = id;
    	}
    
    public String getTitle() { 
    	return booktitle;
    	
    }
    public void setTitle(String title) {
    	this.booktitle = title;
    	}
    
    public Double getPrice() { 
    	return bookprice; 
    	}
    public void setPrice(Double price) {
    	this.bookprice = price; 
    	}
    
    public Integer getQuantity() { 
    	return bookquantity; 
    	}
    public void setQuantity(Integer quantity) {
    	
    	this.bookquantity = quantity;
    	}
}



