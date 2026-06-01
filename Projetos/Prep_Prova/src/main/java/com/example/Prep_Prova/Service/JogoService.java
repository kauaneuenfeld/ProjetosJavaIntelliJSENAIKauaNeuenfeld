package com.example.Prep_Prova.Service;

import com.example.Prep_Prova.Model.Jogo;
import com.example.Prep_Prova.Repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class JogoService {

    @Autowired
    private JogoRepository jogoRepository;

    //salvar jogo
    public Jogo salvar(Jogo jogo){
        return jogoRepository.save(jogo);
    }

    //listar todos
    public List<Jogo> listar(){
        return jogoRepository.findAll();
    }

    public Jogo buscarPorId(Long id){
        return jogoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Jogo não encontrado"));
    }



}
