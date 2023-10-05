package br.com.cadastroDeUsuarios.view;

import br.com.cadastroDeUsuarios.model.UserRegistration;

import java.util.Scanner;
public class Interface {
    public static void execute() {
        Scanner read = new Scanner(System.in);

        System.out.println("\nEntre com os dados para cadastrar um novo usuário no sistema:");

        System.out.print("Nome de usuário: ");
        String username = read.next();

        System.out.print("Email: ");
        String email = read.next();

        System.out.print("Senha: ");
        String password = read.next();

        UserRegistration registerUser = new UserRegistration(username, email, password);
        String message = registerUser.register();
        System.out.println("\n" + message);


        read.close();
    }
}
