package org.uepb.entity;

import org.uepb.entity.Agenda.Builder;

public abstract class Funcionario {
    private String nome;
    private String especialidade;
    private Agenda agenda = new Agenda();
    private String cpf;

    protected Funcionario(Builder builder) {
        this.nome = builder.nome;
        this.especialidade = builder.especialidade;
        this.cpf = builder.cpf;
        this.agenda = new Agenda();
        this.agenda.setNomeDono(nome);
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

    public static abstract class Builder<T extends Funcionario, B extends Builder<T, B>> {
        private String nome;
        private String especialidade;
        private String cpf;

        protected abstract B self();

        public B nome(String nome) {
            this.nome = nome;
            return self();
        }

        public B especialidade(String especialidade) {
            this.especialidade = especialidade;
            return self();
        }

        public B cpf(String cpf) {
            this.cpf = cpf;
            return self();
        }

        public abstract T build();
    }
}
