package com.example.ExSpringbootComPostman.Controller;


import com.example.ExSpringbootComPostman.Model.Aluno;
import com.example.ExSpringbootComPostman.Service.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
@RequiredArgsConstructor
public class AlunoController {

    private final AlunoService service;

    @GetMapping
    public List<Aluno>listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> buscar(@PathVariable Long id){return ResponseEntity.ok(service.buscarPorId(id));}

    @PostMapping
    public ResponseEntity<Aluno> salvar(@RequestBody Aluno aluno){
        return ResponseEntity.ok(service.salvar(aluno));

    }

    @PutMapping("/{id}")
    public ResponseEntity<Aluno> atualizar(@PathVariable Long id, @RequestBody Aluno dados) { // Corrigido @PathVariable
        return ResponseEntity.ok(service.atualizar(id, dados));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}


