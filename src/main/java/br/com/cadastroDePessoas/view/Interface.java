package br.com.cadastroDePessoas.view;

import br.com.cadastroDePessoas.model.StoreUser;

import java.util.Scanner;
public class Interface {
    public void execute() {
        System.out.println("Entre com os dados para cadastrar um novo usuário no sistema:");
        Scanner read = new Scanner(System.in);

        System.out.print("Nome de usuário: ");
        String username = read.next();

        System.out.print("Email: ");
        String email = read.next();

        System.out.print("Senha: ");
        String password = read.next();

        System.out.println("Usuário cadastrado com sucesso!");

        StoreUser registerNewUser = new StoreUser(username, email, password);
        System.out.println(registerNewUser.storeUserData());

    }
}
