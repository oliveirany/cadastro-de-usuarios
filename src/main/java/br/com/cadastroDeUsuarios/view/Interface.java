package br.com.cadastroDeUsuarios.view;

import br.com.cadastroDeUsuarios.model.StoreUser;

import java.util.Scanner;
public class Interface {
    public static void execute() {
        Scanner read = new Scanner(System.in);
        String entry;

        while(true) {
            System.out.println("Digite 'sair' se deseja fechar o programa.");
            entry = read.nextLine();
            if (entry.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o programa...");
                break;
            }

            System.out.println("\nEntre com os dados para cadastrar um novo usuário no sistema:");

            System.out.print("Nome de usuário: ");
            String username = read.next();

            System.out.print("Email: ");
            String email = read.next();

            System.out.print("Senha: ");
            String password = read.next();

            System.out.println("\nUsuário cadastrado com sucesso!");

            StoreUser registerNewUser = new StoreUser(username, email, password);
            System.out.println(registerNewUser.storeUserData());

        }

        read.close();
    }
}
