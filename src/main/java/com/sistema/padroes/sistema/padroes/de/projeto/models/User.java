package com.sistema.padroes.sistema.padroes.de.projeto.models;

import jakarta.persistence.*;

@Entity
@Table(name = "users") // Define o nome da tabela no banco
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera ID automaticamente
    private Long id;

    private String name;
    private String email;

    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
