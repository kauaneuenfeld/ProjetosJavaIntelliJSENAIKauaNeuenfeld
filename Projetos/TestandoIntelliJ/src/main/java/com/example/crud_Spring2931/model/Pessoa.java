package com.example.crud_Spring2931.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pessoas")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Pessoa {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private int idade;
    // Lombok gera tudo automaticamente
    //getID, getNome, getIdade
    //setID, setNome, setIdade

}
