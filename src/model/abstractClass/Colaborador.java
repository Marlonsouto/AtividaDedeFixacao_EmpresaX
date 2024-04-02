package model.abstractClass;

import model.interfaces.ContratoFuncionario;

import java.util.Objects;

public abstract class Colaborador {
    private String nome;
    private char gerero;
    private Integer cpf;
    private Double salarioBruto;
    private ContratoFuncionario contratofunconario;

    public Colaborador(String nome, char gerero, Integer cpf, Double salarioBruto) {
        this.nome = nome;
        this.gerero = gerero;
        this.cpf = cpf;
        this.salarioBruto = salarioBruto;
    }

    public Colaborador() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public char getGerero() {
        return gerero;
    }

    public void setGerero(char gerero) {
        this.gerero = gerero;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public ContratoFuncionario getContratofunconario() {
        return contratofunconario;
    }

    public void setContratofunconario(ContratoFuncionario contratofunconario) {
        this.contratofunconario = contratofunconario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Colaborador that = (Colaborador) o;
        return gerero == that.gerero && Objects.equals(nome, that.nome) && Objects.equals(cpf, that.cpf) && Objects.equals(salarioBruto, that.salarioBruto) && Objects.equals(contratofunconario, that.contratofunconario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, gerero, cpf, salarioBruto, contratofunconario);
    }
    /* @Override
    public void validacaoAcessoConta(String email, String Senha) {

        if (this.email.equals(email) && this.senha.equals(senha)){
            System.out.println("Bem vindo");

        } else {
         throw new RuntimeException("error: senha ou email incorretos ");
        }
    }*/

}
