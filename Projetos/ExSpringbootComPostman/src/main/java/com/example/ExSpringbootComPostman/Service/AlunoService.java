package com.example.ExSpringbootComPostman.Service;

import com.example.ExSpringbootComPostman.Model.Aluno;
import com.example.ExSpringbootComPostman.Repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoService {

    private final AlunoRepository repository;

    public List<Aluno> listar(){
        return repository.findAll();
    }

    public Aluno buscarPorId(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("pessoa não encontrada"));
    }

    public Aluno salvar(Aluno aluno){
        return repository.save(aluno);
    }

    public Aluno atualizar(Long id, Aluno dados){
        Aluno aluno = buscarPorId(id);
        aluno.setNome(dados.getNome());
        aluno.setCurso(dados.getCurso());
        aluno.setMatricula(dados.getMatricula());
        return repository.save(aluno);
    }

    public void excluir(Long id){repository.deleteById(id);}

}
//dede