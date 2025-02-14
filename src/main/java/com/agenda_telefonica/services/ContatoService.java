package com.agenda_telefonica.services;

import com.agenda_telefonica.DTO.ContatoDTO;
import com.agenda_telefonica.repositories.ContatoModel;

public class ContatoService {
    
    private ContatoModel contatoModel;

    public ContatoService() {
        this.contatoModel = new ContatoModel();
    }

    public void adicionarContato(ContatoDTO contatoDTO) {

        ContatoModel contato = new ContatoModel(
            contatoDTO.getName(),
            contatoDTO.getPhone(),
            contatoDTO.getEmail()
        );
        contatoModel.adicionarContato(contato);
    }

    public void listarContato() {
        for (ContatoModel contatoModel : contatoModel.contatos) {
            System.out.println("Nome de Contato: " + contatoModel.getName());
            System.out.println("Telefone de Contato: " + contatoModel.getPhone());
            System.out.println("Email de Contato: " + contatoModel.getEmail());
            System.err.println("----------------------");
        }
    }

    public ContatoModel buscarContato(String name) {
        for (ContatoModel contatoModel : contatoModel.contatos) {
            if (contatoModel.getName().equalsIgnoreCase(name)) {
                System.out.println("Nome de Contato: " + contatoModel.getName());
                System.out.println("Telefone de Contato: " + contatoModel.getPhone());
                System.out.println("Email de Contato: " + contatoModel.getEmail());
                return contatoModel;
            }
        }
        return null;
    }

}
