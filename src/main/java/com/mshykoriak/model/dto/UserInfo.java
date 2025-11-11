package com.mshykoriak.model.dto;

import jakarta.validation.constraints.NotBlank;

public class UserInfo {
    @NotBlank
    private String name;
    @NotBlank
    private String surname;
    @NotBlank
    private String email;

    public UserInfo(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
