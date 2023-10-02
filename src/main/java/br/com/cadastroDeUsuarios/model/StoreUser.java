package br.com.cadastroDeUsuarios.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

// TODO: persistencia de dados, conecxao ao db
public class StoreUser {
    private static final String datePattern = "dd/MM/YYYY";
    ArrayList<HashMap<String, String>> users = new ArrayList<>();
    String username;
    String email;
    String password;
    public StoreUser(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }


    public String storeUserData() {
        HashMap<String, String> userData = new HashMap<>();
        userData.put("username", this.username);
        userData.put("email", this.email);
        userData.put("password", this.password);
        userData.put("registrationDate", todayDate(datePattern));

        users.add(userData);

        return showUserData(users);

    }

    public String showUserData(ArrayList<HashMap<String, String>> users) {
        StringBuilder userDataString = new StringBuilder();

        for ( int i = 0; i < users.size(); i++) {
            HashMap<String, String> user = users.get(i);

            userDataString.append("Usuário: " + i + 1);
            userDataString.append("\nNome de usuário cadastrado: " + user.get("username"));
            userDataString.append("\nEmail cadastrado: " + user.get("email"));
            userDataString.append("\nSenha cadastrada: " + user.get("password"));
            userDataString.append("\nData do cadastro: " + user.get("registrationDate"));
        }

        return userDataString.toString();
    }

    private static String todayDate(String pattern) {
        LocalDate dateObj = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        return dateObj.format(formatter);
    }
}
