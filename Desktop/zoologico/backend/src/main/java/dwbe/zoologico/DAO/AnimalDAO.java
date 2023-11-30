package dwbe.zoologico.DAO;
import dwbe.zoologico.model.Animal;

import java.util.ArrayList;
import java.util.List;

// AnimalDAO.java
public class AnimalDAO {
    private List<Animal> animais = new ArrayList<>();

    public void cadastrarAnimal(Animal animal) {
        animais.add(animal);
    }

    public List<Animal> listarAnimais() {
        return new ArrayList<>(animais);
    }

    public Animal buscarAnimalPorNome(String nome) {
        for (Animal animal : animais) {
            if (animal.getNome().equals(nome)) {
                return animal;
            }
        }
        return null;
    }

    public void atualizarAnimal(Animal animalAtualizado) {
        for (Animal animal : animais) {
            if (animal.getNome().equals(animalAtualizado.getNome())) {
                animal.setEspecie(animalAtualizado.getEspecie());
                animal.setIdade(animalAtualizado.getIdade());
                animal.setCarteiraVacina(animalAtualizado.isCarteiraVacina());
                break;
            }
        }
    }

    public void deletarAnimal(String nome) {
        animais.removeIf(animal -> animal.getNome().equals(nome));
    }
}