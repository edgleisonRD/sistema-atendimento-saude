package Main;

import Model.*;
import Service.AtendimentoService;

import java.util.Date;

public class Aplicacao {

    public static void main(String[] args) {

       //Criando o paciente
        Paciente paciente = new Paciente(
                1,
                "João da Silva",
                "123.456.789-00",
                new Date(),
                "1199999-9999",
                1001,
                "Plano Ouro"
        );

        // Criando profissionais (polimorfismo em ação)
        ProfissionalSaude medico = new Medico(
                1,
                "Dr. Carlos",
                "987.654.321-00",
                new Date(),
                "1198888-8888",
                12345,
                "Clínico Geral"
        );

        ProfissionalSaude enfermeiro = new Enfermeiro(
                2,
                "Enf. Maria",
                "111.222.333-44",
                new Date(),
                "1197777-7777",
                54321,
                "Triagem"
        );

        ProfissionalSaude tecnico = new TecnicoEnfermagem(
                3,
                "Tec. José",
                "555.666.777-88",
                new Date(),
                "1196666-6666",
                67890,
                "Procedimentos"
        );

        // Service (Inversão de Controle)
        AtendimentoService atendimentoService = new AtendimentoService();

        // Realizando atendimentos
        Atendimento atendimento1 = atendimentoService.realizarAtendimento(paciente, enfermeiro);
        Atendimento atendimento2 = atendimentoService.realizarAtendimento(paciente, medico);
        Atendimento atendimento3 = atendimentoService.realizarAtendimento(paciente, tecnico);

        // Exibindo resultados
        exibirAtendimento(atendimento1);
        exibirAtendimento(atendimento2);
        exibirAtendimento(atendimento3);
    }

    private static void exibirAtendimento(Atendimento atendimento) {
        System.out.println("==================================");
        System.out.println("Paciente: " + atendimento.getPaciente().getNome());
        System.out.println("Profissional: " + atendimento.getProfissional().getNome());
        System.out.println("Especialidade: " + atendimento.getProfissional().getEspecialidade());
        System.out.println("Tipo de Atendimento: " + atendimento.getTipo());
        System.out.println("Descrição: " + atendimento.getDescricao());
        System.out.println("Data: " + atendimento.getData());
    }
}