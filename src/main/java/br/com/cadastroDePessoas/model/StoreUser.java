package br.com.cadastroDePessoas.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class StoreUser {
    private static final String datePattern = "dd/MM/YYYY";
    HashMap<String, String> userData = new HashMap<>();
    String username;
    String email;
    String password;
    public StoreUser(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }


    public String storeUserData() {
        userData.put("username", this.username);
        userData.put("email", this.email);
        userData.put("password", this.password);
        userData.put("registrationDate", todayDate(datePattern));

        return showUserData(userData);
    }

    public String showUserData(HashMap userData) {
        StringBuilder userDataString = new StringBuilder();
        userDataString.append("\nNome de usuário cadastrado: " + userData.get("username"));
        userDataString.append("\nEmail cadastrado: " + userData.get("email"));
        userDataString.append("\nSenha cadastrada: " + userData.get("password"));
        userDataString.append("\nData do cadastro: " + userData.get("registrationDate"));

        return userDataString.toString();
    }

    private static String todayDate(String pattern) {
        LocalDate dateObj = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        return dateObj.format(formatter);
    }
}
