package com.example.ExercicioComH2.Service;

import com.example.ExercicioComH2.Model.UsuarioGamer;
import com.example.ExercicioComH2.Repository.UsuarioGamerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioGamerService {

    private final UsuarioGamerRepository repository;

    public List<UsuarioGamer> listar(){
        return repository.findAll();
    }

    public UsuarioGamer buscarPorId(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario não encontrado"));
    }

    public UsuarioGamer salvar(UsuarioGamer usuarios){
        return repository.save(usuarios);
    }

    public UsuarioGamer atualizar(Long id, UsuarioGamer dados){
        UsuarioGamer usuarios = buscarPorId(id);
        usuarios.setNickname(dados.getNickname());
        usuarios.setEmail(dados.getEmail());
        usuarios.setNivel(dados.getNivel());
        usuarios.setJogoFavorito(dados.getJogoFavorito());
        return repository.save(usuarios);
    }

    public void excluir(Long id){repository.deleteById(id);}

}
