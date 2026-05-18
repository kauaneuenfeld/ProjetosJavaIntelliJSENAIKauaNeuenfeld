package com.example.ExercicioComH2.Controller;

import com.example.ExercicioComH2.Model.UsuarioGamer;
import com.example.ExercicioComH2.Service.UsuarioGamerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UsuarioGamerController {

    private final UsuarioGamerService service;

    @GetMapping("/")
    public String listar(Model model) {
        model.addAttribute("Usuarios", service.listar());
        return "lista";

    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("Usuarios", new UsuarioGamer());
        return "form";
    }

    @PostMapping("/salvar")
    public String salvar(UsuarioGamer usuarioGamer) {
        service.salvar(usuarioGamer);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        UsuarioGamer usuarioGamer = service.buscarPorId(id);
        model.addAttribute("Usuarios", usuarioGamer);
        return "form";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        service.excluir(id);
        return "redirect:/";
    }
}
