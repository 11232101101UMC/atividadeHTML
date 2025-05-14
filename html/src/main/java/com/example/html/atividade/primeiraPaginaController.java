package com.example.html.atividade;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/cachorro")
public class primeiraPaginaController {
    //localhost:8080/home
    @Autowired
    private primeiraRepositorio repositorio;

@GetMapping("/criar")
    public String criar( Model model) { //model é atributo do springboot
    model.addAttribute("mensagemDaController", "Criar Primeira Página");
    return "design";
}





@PostMapping("/cadastro")
public void atribuir(primeiraPaginaModel model) {

        System.out.println("Ta aqui");
        var nModel=this.repositorio.save(model);

        System.out.println("salvou os dados no banco de dados");
        System.out.println(nModel);



}

    @GetMapping("/cadastro")
    public ModelAndView tela() {
        ModelAndView mv = new ModelAndView("novo/design");
        mv.addObject("primeiraPaginaModel", new primeiraPaginaModel());
        return mv;
    }


}

