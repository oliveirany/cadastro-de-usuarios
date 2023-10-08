package br.com.cadastroDeUsuarios.database.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;

    private String email;

    private String password;
    private LocalDate registrationDate = LocalDate.now();

    @Enumerated(EnumType.STRING)
    private Category category;

    public User(String username, String email, String password, Category category) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.category = category;
    }
}
