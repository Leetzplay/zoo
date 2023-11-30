package dwbe.zoologico.view;

import dwbe.zoologico.model.Funcionario;

public class FuncionarioView {

    public void exibirInformacoesFuncionario(Funcionario funcionario) {
        System.out.println("Informações do Funcionário:");
        System.out.println("ID: " + funcionario.getId());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Turno de Trabalho: " + funcionario.getTurnoTrabalho());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println();
    }
}