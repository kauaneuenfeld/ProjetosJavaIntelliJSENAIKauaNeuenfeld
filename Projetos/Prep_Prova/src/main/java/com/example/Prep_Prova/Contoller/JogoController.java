package com.example.Prep_Prova.Contoller;

import com.example.Prep_Prova.Model.Jogo;
import com.example.Prep_Prova.Repository.JogoRepository;
import com.example.Prep_Prova.Service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogos")

public class JogoController {

    //anotacao para que vai instruir o spring a procurar uma insatncia pronta
    @Autowired
    private JogoService service;

    @PostMapping
    public Jogo salvar(@RequestBody Jogo jogo) {
        return service.salvar(jogo);
    }

    @GetMapping
    public List<Jogo> listar() {
        return service.listar();
    }
}
