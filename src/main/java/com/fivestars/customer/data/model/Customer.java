package com.fivestars.customer.data.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customer")
public class Customer {

    @Id
    private String id;
    private String name;
    private String email;
    private Long phone;
    private Double monthlyIncome;

    public Customer() {
    }

    public Customer(String name, String email, Long phone, Double monthlyIncome) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.monthlyIncome = monthlyIncome;
    }

    public Customer(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }


    public Long getPhone() {
        return phone;
    }


    public Double getMonthlyIncome() {
        return monthlyIncome;
    }

}
