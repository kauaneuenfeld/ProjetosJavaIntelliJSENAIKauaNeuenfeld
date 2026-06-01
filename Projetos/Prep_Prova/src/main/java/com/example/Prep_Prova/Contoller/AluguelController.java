package com.example.Prep_Prova.Contoller;

import com.example.Prep_Prova.Model.Aluguel;
import com.example.Prep_Prova.Repository.AluguelRepository;
import com.example.Prep_Prova.Service.AluguelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alugueis")
public class AluguelController {

    @Autowired
    private AluguelService service;

    @PostMapping
    public Aluguel salvar(@RequestBody Aluguel aluguel){
        return service.salvar(aluguel);
    }

    @GetMapping
    public List<Aluguel> listar(){
        return service.listar();
    }
}
