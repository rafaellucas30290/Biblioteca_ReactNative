package Biblioteca.api.br.API.Biblioteca.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @Embedded
    private Address adress;

    @NotBlank
    @Column(unique = true)
    private String login;

    @NotBlank
    private String password;

    @Column(length = 20)
    @Pattern(
            regexp = "^\\+?[0-9 ()-]{10,20}$",
            message = "Telefone inválido"
    )
    private String phoneNumber;

}
