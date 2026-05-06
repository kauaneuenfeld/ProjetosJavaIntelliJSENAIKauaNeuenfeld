package com.example.crud_Spring2931.repository;

import com.example.crud_Spring2931.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    //Jpa gera automaticamente
    //save(), findAll(), findById()
    //deleteById()

}
