package dwbe.zoologico.controller;
import dwbe.zoologico.DAO.AnimalDAO;
import dwbe.zoologico.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/animal")
public class AnimalController {
    private final AnimalDAO animalDAO = new AnimalDAO();

    @PostMapping("/cadastrar")
    public String cadastrarAnimal(@RequestParam String nome,
                                  @RequestParam String especie,
                                  @RequestParam int idade,
                                  @RequestParam(defaultValue = "false") boolean vacinaAnimal) {
        Animal animal = new Animal(nome, especie, idade, vacinaAnimal);
        animalDAO.cadastrarAnimal(animal);
        return "redirect:/";
    }

    @GetMapping("/listar")
    @ResponseBody
    public List<Animal> listarAnimais() {
        return animalDAO.listarAnimais();
    }

    // Implemente outros métodos conforme necessário
}
