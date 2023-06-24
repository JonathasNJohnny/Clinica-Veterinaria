package org.uepb.entity;

public class Atendimento {

    public Atendimento(Animal animalPaciente, String horarioAtendimento, String descricao) {
		super();
		this.animalPaciente = animalPaciente;
		this.horarioAtendimento = horarioAtendimento;
		this.descricao = descricao;
	}

	private Animal animalPaciente;
    private String horarioAtendimento;
    private String descricao;

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
}
