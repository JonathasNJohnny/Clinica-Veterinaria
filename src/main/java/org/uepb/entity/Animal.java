package org.uepb.entity;

public class Animal {

    private String nome;
    private String especie;
    private String raca;
    private Cliente dono;

    private Animal(Builder builder) {
        this.nome = builder.nome;
        this.especie = builder.especie;
        this.raca = builder.raca;
        this.dono = builder.dono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", raca='" + raca + '\'' +
                ", dono=" + dono +
                '}';
    }

    public static class Builder {
        private String nome;
        private String especie;
        private String raca;
        private Cliente dono;

        public Builder() {
        }

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder especie(String especie) {
            this.especie = especie;
            return this;
        }

        public Builder raca(String raca) {
            this.raca = raca;
            return this;
        }

        public Builder dono(Cliente dono) {
            this.dono = dono;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }
}
