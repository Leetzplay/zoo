package dwbe.zoologico.model;

import java.util.ArrayList;
import java.util.List;
public class Funcionario {
    private int id;
    private String nome;
    private String cargo;
    private double salario;
    private String turnoTrabalho;
    private String cpf;

    // Construtores, getters e setters

    public Funcionario() {}

    public Funcionario(int id, String nome, String cargo, double salario, String turnoTrabalho, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.turnoTrabalho = turnoTrabalho;
        this.cpf = cpf;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurnoTrabalho() {
        return turnoTrabalho;
    }

    public void setTurnoTrabalho(String turnoTrabalho) {
        this.turnoTrabalho = turnoTrabalho;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}