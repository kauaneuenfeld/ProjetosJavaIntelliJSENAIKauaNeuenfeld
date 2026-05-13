package com.example.ExercicioComH2.Controller;

import com.example.ExercicioComH2.Model.UsuarioGamer;
import com.example.ExercicioComH2.Service.UsuarioGamerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioGamerController {

    private  final UsuarioGamerService service;

    @GetMapping
    public List<UsuarioGamer> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioGamer> buscar(@PathVariable Long id){return ResponseEntity.ok(service.buscarPorId(id));}

    @PostMapping
    public  ResponseEntity<UsuarioGamer> salvar(@RequestBody UsuarioGamer Usuarios){
        return ResponseEntity.ok(service.salvar(Usuarios));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioGamer> atualizar(@PathVariable Long id, @RequestBody UsuarioGamer dados){
        return  ResponseEntity.ok(service.atualizar(id, dados));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }

}
