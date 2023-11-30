package dwbe.zoologico.model;
public class Visitante {
    private int id;
    private String nome;
    private int idade;
    private String tipoIngresso;
    private boolean possuiGuia;
    private boolean possuiMapa;

    // Construtores, getters e setters

    public Visitante() {}

    public Visitante(int id, String nome, int idade, String tipoIngresso, boolean possuiGuia, boolean possuiMapa) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.tipoIngresso = tipoIngresso;
        this.possuiGuia = possuiGuia;
        this.possuiMapa = possuiMapa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    public boolean isPossuiGuia() {
        return possuiGuia;
    }

    public void setPossuiGuia(boolean possuiGuia) {
        this.possuiGuia = possuiGuia;
    }

    public boolean isPossuiMapa() {
        return possuiMapa;
    }

    public void setPossuiMapa(boolean possuiMapa) {
        this.possuiMapa = possuiMapa;
    }
}