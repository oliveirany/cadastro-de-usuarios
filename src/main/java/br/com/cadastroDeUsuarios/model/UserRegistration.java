package br.com.cadastroDeUsuarios.model;

import br.com.cadastroDeUsuarios.database.entities.Category;
import br.com.cadastroDeUsuarios.database.entities.User;
import br.com.cadastroDeUsuarios.database.dao.UserDAO;
import br.com.cadastroDeUsuarios.database.util.JPAUtil;

public class UserRegistration extends JPAUtil{
    private String username;
    private String email;
    private String password;
    public UserRegistration(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String register() throws Exception {
        try {
            User newUser = new User(username, email, password, Category.STANDARD);

            UserDAO dao = new UserDAO(getEntityManager());
            dao.register(newUser);

            return "Usuario cadastrado com sucesso!";
        } catch (Exception e) {
            throw new Exception("Erro ao cadastrar usuário: " + e);
        }
    }
}
