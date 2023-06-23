package petshop;

import java.util.Date;

public class Atendimento {

    private Animal animalPaciente;
    private Date horarioAtendimento;
    private String descricao;
    
    public Atendimento(Animal animalPaciente, Date horarioAtendimento, String descricao) {
		super();
		this.animalPaciente = animalPaciente;
		this.horarioAtendimento = horarioAtendimento;
		this.descricao = descricao;
	}

	public Animal getAnimalPaciente() {
        return animalPaciente;
    }

    public void setAnimalPaciente(Animal animalPaciente) {
        this.animalPaciente = animalPaciente;
    }

    public Date getHorarioAtendimento() {
        return horarioAtendimento;
    }

    public void setHorarioAtendimento(Date horarioAtendimento) {
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
        return "Atendimento{" +
                "animalPaciente=" + animalPaciente +
                ", horarioAtendimento=" + horarioAtendimento +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    //TODO: FAZER O MÉTODO ALTERAR_DATA
}