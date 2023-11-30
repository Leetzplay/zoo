package dwbe.zoologico.controller;

import dwbe.zoologico.DAO.VisitanteDAO;
import dwbe.zoologico.model.Visitante;
import dwbe.zoologico.view.VisitanteView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/visitante")
public class VisitanteController {
    private final VisitanteDAO visitanteDAO = new VisitanteDAO();

    @PostMapping("/cadastrar")
    public String cadastrarVisitante(@RequestParam int id,
                                     @RequestParam String nome,
                                     @RequestParam int idade,
                                     @RequestParam String tipoIngresso,
                                     @RequestParam(defaultValue = "false") boolean possuiGuia,
                                     @RequestParam(defaultValue = "false") boolean possuiMapa) {
        Visitante visitante = new Visitante(id, nome, idade, tipoIngresso, possuiGuia, possuiMapa);
        visitanteDAO.cadastrarVisitante(visitante);
        return "redirect:/";
    }

    @GetMapping("/listar")
    @ResponseBody
    public List<Visitante> listarVisitantes() {
        return visitanteDAO.listarVisitantes();
    }

    // Implemente outros métodos conforme necessário
}
