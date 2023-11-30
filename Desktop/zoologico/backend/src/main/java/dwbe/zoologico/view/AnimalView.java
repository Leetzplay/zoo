package dwbe.zoologico.view;

import dwbe.zoologico.model.Animal;

public class AnimalView {

    public void exibirInformacoesAnimal(Animal animal) {
        System.out.println("Informações do Animal:");
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Espécie: " + animal.getEspecie());
        System.out.println("Idade: " + animal.getIdade());
        System.out.println("Carteira de Vacinação: " + (animal.isCarteiraVacina() ? "Sim" : "Não"));
        System.out.println();
    }
}