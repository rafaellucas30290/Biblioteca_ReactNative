package Biblioteca.api.br.API.Biblioteca.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
@Table(name="employees")
public class Employee extends Person{

    @NotBlank
    private BigDecimal salary;

    @NotBlank
    private String workCard;





}
