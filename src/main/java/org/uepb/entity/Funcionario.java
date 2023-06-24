package org.uepb.entity;

public abstract class Funcionario {
    private String nome;
    private Agenda agenda = new Agenda();
    private String cpf;

    public Funcionario(String nome,  String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.agenda = new Agenda();
        this.agenda.setNomeDono(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
}
