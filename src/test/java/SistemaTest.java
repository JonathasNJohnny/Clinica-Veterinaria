//import static org.junit.jupiter.api.Assertions.*;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.RepeatedTest;
//import org.junit.jupiter.api.Test;
//import org.uepb.controller.Sistema;
//import org.uepb.entity.*;
//
//import java.util.ArrayList;
//
//class SistemaTest {
//    Sistema sis;
//
//    @BeforeEach
//    void setUp(){
//        ArrayList<Atendimento> atendimentos = new ArrayList<Atendimento>();
//
//        Agenda.Builder builderAgenda = new Agenda.Builder();
//        Agenda agenda = builderAgenda.nomeDono("Sansão Carrasco").atendimentos(atendimentos).build();
//
//        Groomer.GroomerBuilder builder = new Groomer.GroomerBuilder();
//        Groomer groomerTeste = builder.nome("Sansão Carrasco").cpf("123.456.789-12").especialidade("Cachorros").agenda(agenda).build();
//
//        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
//        funcionarios.add(groomerTeste);
//
//        sis = new Sistema();
//        sis.setFuncionarios(funcionarios);
//
//
//    }
//}