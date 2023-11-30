package dwbe.zoologico.controller;

import dwbe.zoologico.DAO.ProdutoDAO;
import dwbe.zoologico.model.Produto;
import dwbe.zoologico.view.ProdutoView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
    private final ProdutoDAO produtoDAO = new ProdutoDAO();

    @PostMapping("/cadastrar")
    public String cadastrarProduto(@RequestParam int id,
                                   @RequestParam double preco,
                                   @RequestParam(defaultValue = "false") boolean brinquedo,
                                   @RequestParam(defaultValue = "false") boolean lanche) {
        Produto produto = new Produto(id, preco, brinquedo, lanche);
        produtoDAO.cadastrarProduto(produto);
        return "redirect:/";
    }

    @GetMapping("/listar")
    @ResponseBody
    public List<Produto> listarProdutos() {
        return produtoDAO.listarProdutos();
    }

    // Implemente outros métodos conforme necessário
}
