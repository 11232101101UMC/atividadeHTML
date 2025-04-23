package com.example.html.atividade;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class primeiraPaginaController {
    //localhost:8080/home

@GetMapping("criar")
    public String criar( Model model) { //model é atributo do springboot
    model.addAttribute("mensagemDaController", "Criar Primeira Página");
    return "design";
}






}
