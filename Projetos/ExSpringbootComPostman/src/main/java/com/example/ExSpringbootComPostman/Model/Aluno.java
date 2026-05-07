package com.example.ExSpringbootComPostman.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "aluno")
public class Aluno {
    @Id
    @GeneratedValue

    private Long id;
    private String nome;
    private String curso;
    private String matricula;
}
