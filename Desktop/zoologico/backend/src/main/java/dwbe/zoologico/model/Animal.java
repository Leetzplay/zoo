package dwbe.zoologico.model;
// Animal.java
public class Animal {
    private String nome;
    private String especie;
    private int idade;
    private boolean carteiraVacina;

    // Construtores, getters e setters

    public Animal() {}

    public Animal(String nome, String especie, int idade, boolean carteiraVacina) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.carteiraVacina = carteiraVacina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isCarteiraVacina() {
        return carteiraVacina;
    }

    public void setCarteiraVacina(boolean carteiraVacina) {
        this.carteiraVacina = carteiraVacina;
    }
}
