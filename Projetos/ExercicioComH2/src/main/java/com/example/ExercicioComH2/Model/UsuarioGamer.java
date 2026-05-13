package com.example.ExercicioComH2.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Usuarios")
public class UsuarioGamer {
    @Id
    @GeneratedValue
    private Long id;
    private String nickname;
    private String email;
    private String jogoFavorito;
    private Integer nivel;

}
