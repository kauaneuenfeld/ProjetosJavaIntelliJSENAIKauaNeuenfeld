package com.example.Prep_Prova.Service;

import com.example.Prep_Prova.Model.Aluguel;
import com.example.Prep_Prova.Model.Jogo;
import com.example.Prep_Prova.Repository.AluguelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AluguelService {

    @Autowired
    private AluguelRepository aluguelRepository;

    public Aluguel salvar(Aluguel aluguel){
        return aluguelRepository.save(aluguel);
    }

    public List<Aluguel> listar(){
        return aluguelRepository.findAll();
    }

    public Aluguel buscarPorid(Long id){
        return aluguelRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluguel não encontrado"));
    }
}
