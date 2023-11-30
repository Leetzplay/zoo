package dwbe.zoologico.model;
public class Produto {
    private int id;
    private double preco;
    private boolean brinquedo;
    private boolean lanche;

    // Construtores, getters e setters

    public Produto() {}

    public Produto(int id, double preco, boolean brinquedo, boolean lanche) {
        this.id = id;
        this.preco = preco;
        this.brinquedo = brinquedo;
        this.lanche = lanche;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isBrinquedo() {
        return brinquedo;
    }

    public void setBrinquedo(boolean brinquedo) {
        this.brinquedo = brinquedo;
    }

    public boolean isLanche() {
        return lanche;
    }

    public void setLanche(boolean lanche) {
        this.lanche = lanche;
    }
}
