package com.fivestars.customer.dto;

public class CustomerDto {

    private String id;
    private String name;
    private String email;
    private Long phone;
    private Double monthlyIncome;

    public CustomerDto(String name, String email, Long phone, Double monthlyIncome) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.monthlyIncome = monthlyIncome;
    }

    public CustomerDto(String id, String name, String email, Long phone, Double monthlyIncome) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.monthlyIncome = monthlyIncome;
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
