package org.uepb.entity;

public abstract class Funcionario {
    private String nome;
    private String especialidade;
    private Agenda agenda = new Agenda();
    private String cpf;

    public Funcionario(String nome, String especialidade, String cpf) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", agenda=" + agenda +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
