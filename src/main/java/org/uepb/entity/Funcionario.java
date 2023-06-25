package org.uepb.entity;

public abstract class Funcionario {
    private String nome;
    private Agenda agenda;
    private String cpf;

    public Funcionario(FuncionarioBuilder<?, ?> builder) {
        this.nome = builder.nome;
        this.agenda = builder.agenda;
        this.cpf = builder.cpf;
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

    public static abstract class FuncionarioBuilder<T extends Funcionario, B extends FuncionarioBuilder<T, B>> {
        private String nome;
        private Agenda agenda = new Agenda();
        private String cpf;

        protected abstract B self();

        public B nome(String nome) {
            this.nome = nome;
            return self();
        }

        public B agenda(Agenda agenda) {
            this.agenda = agenda;
            return self();
        }

        public B cpf(String cpf) {
            this.cpf = cpf;
            return self();
        }

        public abstract T build();
    }
}
