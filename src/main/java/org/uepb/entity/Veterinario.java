package org.uepb.entity;

public class Veterinario extends Funcionario {
    public Veterinario(VeterinarioBuilder builder) {
        super(builder);
    }

    @Override
    public String toString() {
        return "Veterinário\nNome: " + getNome() + "\nCPF: " + getCpf();
    }

    public static class VeterinarioBuilder extends FuncionarioBuilder<Veterinario, VeterinarioBuilder> {
        @Override
        protected VeterinarioBuilder self() {
            return this;
        }

        @Override
        public Veterinario build() {
            return new Veterinario(this);
        }
    }
}
