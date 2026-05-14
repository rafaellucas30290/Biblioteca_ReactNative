package Biblioteca.api.br.API.Biblioteca.entity;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;

public class User extends Person{

    @Column(unique = true)
    @NotBlank
    private String login;

    @NotBlank
    private String password;
}
