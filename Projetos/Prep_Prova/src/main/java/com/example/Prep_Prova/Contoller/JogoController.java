package com.example.Prep_Prova.Contoller;

import com.example.Prep_Prova.Model.Jogo;
import com.example.Prep_Prova.Repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogos")

public class JogoController {

    //anotacao para que vai instruir o spring a procurar uma insatncia pronta
    @Autowired
    private JogoRepository repository;

    @PostMapping
    public Jogo salvar(@RequestBody Jogo jogo){
        return repository.save(jogo);
    }

    @GetMapping
    public List<Jogo> listar(){
        return repository.findAll();
    }
}
