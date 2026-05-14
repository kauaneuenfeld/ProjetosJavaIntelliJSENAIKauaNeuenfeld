package com.example.crud_Spring2931.service;

import com.example.crud_Spring2931.model.Pessoa;
import com.example.crud_Spring2931.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaRepository repository;

    //read
    public List<Pessoa> listar() {
        return repository.findAll();

    }

    //read buscar por id
    public Pessoa buscarPorId(Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pessoa não encontrada."));
    }

    //create
    public Pessoa salvar(Pessoa pessoa) {
        return repository.save(pessoa);

    }

    //update
    public Pessoa atualizar(Long id, Pessoa dados) {
        Pessoa pessoa = buscarPorId(id);
        pessoa.setNome(dados.getNome());
        pessoa.setIdade(dados.getIdade());

        return repository.save(pessoa);

    }

    //delete
    public void excluir(Long id) {
        repository.deleteById(id);
    }


}
