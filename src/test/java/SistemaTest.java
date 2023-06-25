import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.uepb.controller.Sistema;
import org.uepb.entity.*;

import org.uepb.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

class SistemaTest {
    Sistema sis;
    Animal bixo;
    Cliente dono;

    @BeforeEach
    void setUp(){
        ArrayList<Atendimento> atendimentos = new ArrayList<Atendimento>();

        Agenda.AgendaBuilder builderAgenda = new Agenda.AgendaBuilder();
        Agenda agenda = builderAgenda.nomeDono("Sansão Carrasco").atendimentos(atendimentos).build();

        Groomer.GroomerBuilder builder = new Groomer.GroomerBuilder();
        Groomer groomerTeste = builder.nome("Sansão Carrasco").cpf("123.456.789-12").especialidade("Cachorros").build();
        groomerTeste.setAgenda(agenda);

        Agenda.AgendaBuilder builderAgenda2 = new Agenda.AgendaBuilder();
        Agenda agenda2 = builderAgenda.nomeDono("Bing Chilling Xhang Nguyen").atendimentos(atendimentos).build();

        Veterinario.VeterinarioBuilder builder2 = new Veterinario.VeterinarioBuilder();
        Veterinario veterinario = builder2.build();
        veterinario.setAgenda(agenda2);

        ArrayList<Groomer> funcionarios = new ArrayList<Groomer>();
        funcionarios.add(groomerTeste);

        sis = new Sistema();
        sis.setFuncionarios(funcionarios);
        sis.setVeterinario(veterinario);

        Cliente.Builder builderCliente = new Cliente.Builder();
        dono = builderCliente.cpf("123.456.789-12").nome("Quincas Borba").endereco("Rio de Janeiro").telefone("+55 83 98847-7675").build();

        Animal.Builder builderAnimal = new Animal.Builder();
        bixo = builderAnimal.especie("Cão").nome("Quincas Borba").raca("Vira-lata").dono(dono).build();
    }

    @Test
    @DisplayName("Realizar tosa.")
    void testRealizarTosa(){
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
        System.setIn(in);

        Atendimento.Builder builder = new Atendimento.Builder();

        Atendimento atendimento = builder.animalPaciente(bixo).horarioAtendimento("14-09-1890").descricao("Uma consulta qualquer.").build();

        sis.adicionarAtendimento(atendimento);


        sis.realizarAtendimento(sis.getFuncionarios().get(0), 1);

        System.setIn(sysInBackup);
    }

    
    //TODO DETALHES // DIGITAR 2 NESSE TESTE
    @Test
    @DisplayName("Remover atendimento")
    void testRemoverAtendimento() {
    	InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in2 = new ByteArrayInputStream("2".getBytes());
        Atendimento.Builder builder = new Atendimento.Builder();
        Atendimento atendimento = builder.animalPaciente(bixo).horarioAtendimento("14-09-1890").descricao("Uma consulta qualquer.").build();
        sis.adicionarAtendimento(atendimento);
        System.setIn(in2);
        sis.removerAtendimento("Quincas Borba", "Quincas Borba");

        System.setIn(sysInBackup);
    }


    @Test
    @DisplayName("Realizar atendimento com veterinário.")
    void testRealizarAtendVet(){
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
        System.setIn(in);
        Atendimento.Builder builder = new Atendimento.Builder();

        Atendimento atendimento = builder.animalPaciente(bixo).horarioAtendimento("14-09-1890").descricao("Uma consulta qualquer.").build();
        sis.adicionarAtendimento(atendimento);

        sis.realizarAssistenciaVeterianaria(1);

        System.setIn(sysInBackup);
    }
}