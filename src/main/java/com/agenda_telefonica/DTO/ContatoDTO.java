package com.agenda_telefonica.DTO;

public class ContatoDTO {
    private String name;
    private String phone;
    private String email;

    public ContatoDTO(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }
}
