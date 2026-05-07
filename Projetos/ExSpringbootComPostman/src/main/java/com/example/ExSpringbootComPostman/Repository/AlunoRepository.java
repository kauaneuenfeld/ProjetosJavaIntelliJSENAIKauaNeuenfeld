package com.example.ExSpringbootComPostman.Repository;

import com.example.ExSpringbootComPostman.Model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
}
