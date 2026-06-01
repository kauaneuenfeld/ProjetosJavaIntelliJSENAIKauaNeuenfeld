package com.example.Prep_Prova.Service;

import com.example.Prep_Prova.Model.Aluguel;
import com.example.Prep_Prova.Model.Jogo;
import com.example.Prep_Prova.Repository.AluguelRepository;
import com.example.Prep_Prova.Repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AluguelService {

    @Autowired
    private AluguelRepository aluguelRepository;
    @Autowired
    private JogoRepository jogoRepository;

    public Aluguel salvar(Aluguel aluguel){
       Long idJogo = aluguel.getJogo().getId();

       Jogo jogoEncontrado = jogoRepository.findById(idJogo)
               .orElseThrow(() -> new RuntimeException("Jogo não encontrado"));

       if (aluguel.getQuantidade() > jogoEncontrado.getQuantidade()){
           throw new RuntimeException("Quantidade indisponivel para alugar");
       }
       jogoEncontrado.setQuantidade(jogoEncontrado.getQuantidade() - aluguel.getQuantidade());

       aluguel.setJogo(jogoEncontrado);


       return aluguelRepository.save(aluguel);
    }

    public  List<Aluguel> listar(){
        return aluguelRepository.findAll();
    }
}
