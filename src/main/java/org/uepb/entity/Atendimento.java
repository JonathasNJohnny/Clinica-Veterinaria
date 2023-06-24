package org.uepb.entity;

public class Atendimento {

    private Animal animalPaciente;
    private String horarioAtendimento;
    private String descricao;

    private Atendimento(Builder builder) {
        this.animalPaciente = builder.animalPaciente;
        this.horarioAtendimento = builder.horarioAtendimento;
        this.descricao = builder.descricao;
    }

    public Animal getAnimalPaciente() {
        return animalPaciente;
    }

    public void setAnimalPaciente(Animal animalPaciente) {
        this.animalPaciente = animalPaciente;
    }

    public String getHorarioAtendimento() {
        return horarioAtendimento;
    }

    public void setHorarioAtendimento(String horarioAtendimento) {
        this.horarioAtendimento = horarioAtendimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Atendimento" +
                "\nNome Pet: " + animalPaciente.getNome() +
                "\nNome Dono: " + animalPaciente.getDono().getNome() +
                ",\nHorario: " + horarioAtendimento +
                ",\nDescrição: '" + descricao + "\n";
    }

    public static class Builder {
        private Animal animalPaciente;
        private String horarioAtendimento;
        private String descricao;

        public Builder() {
        }

        public Builder animalPaciente(Animal animalPaciente) {
            this.animalPaciente = animalPaciente;
            return this;
        }

        public Builder horarioAtendimento(String horarioAtendimento) {
            this.horarioAtendimento = horarioAtendimento;
            return this;
        }

        public Builder descricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public Atendimento build() {
            return new Atendimento(this);
        }
    }
}
