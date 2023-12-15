package github.lugom.Polymorphism.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Usuario
{
    private String nome = "";
    private String sobrenome = "";
    private int idade = 0;
    private LocalDate nascimento = LocalDate.now();
    private String local_de_trabalho = "";
    private double salario = 0;

    public Usuario(){}
    public Usuario(String nome, String sobrenome, int idade, LocalDate nascimento, String local_de_trabalho, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nascimento = nascimento;
        this.local_de_trabalho = local_de_trabalho;
        this.salario = salario;
        this.idade = idade;
    }
    //GETTERS E SETTERS MAIS ABAIXO
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getLocal_de_trabalho() {
        return local_de_trabalho;
    }

    public void setLocal_de_trabalho(String local_de_trabalho) {
        this.local_de_trabalho = local_de_trabalho;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString()
    {
        return "Nome: " + getNome() + " " + getSobrenome() + "\n" +
               "Idade: " + getIdade() + "\n" +
               "Data de Nascimento: " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(getNascimento()) + "\n" +
               "Local de Trabalho: " + getLocal_de_trabalho() + "\n" +
               "Salário: R$ " + getSalario();
    }
}
