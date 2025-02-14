package com.agenda_telefonica.repositories;

import java.util.ArrayList;
import java.util.List;


public class ContatoModel {
    
    public List<ContatoModel> contatos = new ArrayList<>();

    private String name;
    private String phone;
    private String email;

    public ContatoModel() {
    }

    public ContatoModel (String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void adicionarContato(ContatoModel contato) {
        contatos.add(contato);
    }

}
