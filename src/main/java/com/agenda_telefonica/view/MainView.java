package com.agenda_telefonica.view;

import java.util.Scanner;

import com.agenda_telefonica.DTO.ContatoDTO;
import com.agenda_telefonica.services.ContatoService;

public class MainView {

    private Scanner scanner;
    private ContatoService contatoService;

    public MainView() {
        this.scanner = new Scanner(System.in);
        this.contatoService = new ContatoService();
    }

    public void menu() {

        while (true) {
            System.out.println("==== Gerenciamento Agenda ====");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Listar Contatos");
            System.out.println("3 - Buscar Contato");
            System.out.println("4 - Atualizar Contato");
            System.out.println("5 - Deletar Contato");
            System.out.println("6 - Sair");

            System.out.println("Selecione sua Opção: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    adicionarContato();
                    break;
                case 2:
                    listarContato();
                    break;
                case 6:
                    System.out.println("Saindo a agnência telefônica");
                    return;
                default:
                    break;
            }
        }
    } 

    private String adicionarContato() {
        System.out.println("==== Adicionar Contato ====");
        
        //Adicionar Nome
        System.out.println("Digite o nome: ");
        String name = scanner.nextLine();

        //Adicionar Phone
        System.out.println("Digite o Telefone: ");
        String phone = scanner.nextLine();

        //Adicionar Email
        System.out.println("Digite o email: ");
        String email = scanner.nextLine();

        ContatoDTO contatoDTO = new ContatoDTO(name, phone, email);
        
        contatoService.adicionarContato(contatoDTO);

        return "Contato Adicionado com Sucesso";
    }

    private void listarContato() {
        contatoService.listarContato();
    }
}
