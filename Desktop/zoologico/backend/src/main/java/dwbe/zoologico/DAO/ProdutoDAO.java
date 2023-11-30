package dwbe.zoologico.DAO;

import dwbe.zoologico.model.Produto;

import java.util.ArrayList;
import java.util.List;
public class ProdutoDAO {
    private List<Produto> produtos = new ArrayList<>();

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> listarProdutos() {
        return new ArrayList<>(produtos);
    }

    public Produto buscarProdutoPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public void atualizarProduto(Produto produtoAtualizado) {
        for (Produto produto : produtos) {
            if (produto.getId() == produtoAtualizado.getId()) {
                produto.setPreco(produtoAtualizado.getPreco());
                produto.setBrinquedo(produtoAtualizado.isBrinquedo());
                produto.setLanche(produtoAtualizado.isLanche());
                break;
            }
        }
    }

    public void deletarProduto(int id) {
        produtos.removeIf(produto -> produto.getId() == id);
    }
}