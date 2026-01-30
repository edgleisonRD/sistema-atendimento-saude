package Model;

import java.util.Date;

public class Medico extends ProfissionalSaude{
    public Medico(int id, String nome, String cpf, Date dataNascimento, String telefone, int registroProfissional, String especialidade) {
        super(id, nome, cpf, dataNascimento, telefone, registroProfissional, especialidade);
    }

    @Override
    public Atendimento atenderPaciente(Paciente paciente) {
        Atendimento atendimento = new Atendimento();
        atendimento.setPaciente(paciente);
        atendimento.setProfissional(this);
        atendimento.setTipo("CONSULTA_MEDICA");
        atendimento.setDescricao("Procedimento básico executado e apoio ao atendimento.");
        return atendimento;

    }
}
