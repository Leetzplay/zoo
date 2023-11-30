package dwbe.zoologico.controller;

import dwbe.zoologico.DAO.FuncionarioDAO;
import dwbe.zoologico.model.Funcionario;
import dwbe.zoologico.view.FuncionarioView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/funcionario")
public class FuncionarioController {
    private final FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    @PostMapping("/cadastrar")
    public String cadastrarFuncionario(@RequestParam int id,
                                       @RequestParam String nome,
                                       @RequestParam String cargo,
                                       @RequestParam double salario,
                                       @RequestParam String turnoTrabalho,
                                       @RequestParam String cpf) {
        Funcionario funcionario = new Funcionario(id, nome, cargo, salario, turnoTrabalho, cpf);
        funcionarioDAO.cadastrarFuncionario(funcionario);
        return "redirect:/";
    }

    @GetMapping("/listar")
    @ResponseBody
    public List<Funcionario> listarFuncionarios() {
        return funcionarioDAO.listarFuncionarios();
    }

    // Implemente outros métodos conforme necessário
}
