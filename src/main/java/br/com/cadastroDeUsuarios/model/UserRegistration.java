package br.com.cadastroDeUsuarios.model;

import br.com.cadastroDeUsuarios.database.User;

public class UserRegistration {
    private String username;
    private String email;
    private String password;
    public UserRegistration(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String register() {
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setEmail(email);
        newUser.setPassword(password);

        return "Usuario cadastrado com sucesso!";
    }
}
