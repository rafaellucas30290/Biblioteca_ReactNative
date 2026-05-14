package Biblioteca.api.br.API.Biblioteca.entity;

import Biblioteca.api.br.API.Biblioteca.Enums.CopyStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "copy")
public class Copy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer number;

    @Enumerated(EnumType.STRING)
    private CopyStatus status;

    @ManyToOne
    @JoinColumn(name = "books_isbn")
    private Book book;
}
