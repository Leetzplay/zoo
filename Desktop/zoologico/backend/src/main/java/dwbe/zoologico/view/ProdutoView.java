package dwbe.zoologico.view;

import dwbe.zoologico.model.Produto;

public class ProdutoView {

    public void exibirInformacoesProduto(Produto produto) {
        System.out.println("Informações do Produto:");
        System.out.println("ID: " + produto.getId());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("É brinquedo: " + (produto.isBrinquedo() ? "Sim" : "Não"));
        System.out.println("É lanche: " + (produto.isLanche() ? "Sim" : "Não"));
        System.out.println();
    }
}