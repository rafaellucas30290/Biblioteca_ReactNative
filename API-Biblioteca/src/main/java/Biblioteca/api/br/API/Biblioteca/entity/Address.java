package Biblioteca.api.br.API.Biblioteca.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    private String street;

    private String number;

    private String city;

    private String state;
}
