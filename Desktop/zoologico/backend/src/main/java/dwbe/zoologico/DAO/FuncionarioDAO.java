package dwbe.zoologico.DAO;

import dwbe.zoologico.model.Funcionario;

import java.util.ArrayList;
import java.util.List;
public class FuncionarioDAO {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public List<Funcionario> listarFuncionarios() {
        return new ArrayList<>(funcionarios);
    }

    public Funcionario buscarFuncionarioPorId(int id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == id) {
                return funcionario;
            }
        }
        return null;
    }

    public void atualizarFuncionario(Funcionario funcionarioAtualizado) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == funcionarioAtualizado.getId()) {
                funcionario.setNome(funcionarioAtualizado.getNome());
                funcionario.setCargo(funcionarioAtualizado.getCargo());
                funcionario.setSalario(funcionarioAtualizado.getSalario());
                funcionario.setTurnoTrabalho(funcionarioAtualizado.getTurnoTrabalho());
                funcionario.setCpf(funcionarioAtualizado.getCpf());
                break;
            }
        }
    }

    public void deletarFuncionario(int id) {
        funcionarios.removeIf(funcionario -> funcionario.getId() == id);
    }
}
