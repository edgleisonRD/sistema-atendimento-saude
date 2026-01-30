package Model;

import java.util.Date;

public class TecnicoEnfermagem extends ProfissionalSaude{
    public TecnicoEnfermagem(int id, String nome, String cpf, Date dataNascimento, String telefone, int registroProfissional, String especialidade) {
        super(id, nome, cpf, dataNascimento, telefone, registroProfissional, especialidade);
    }

    @Override
    public Atendimento atenderPaciente(Paciente paciente) {
        Atendimento atendimento = new Atendimento();
        atendimento.setPaciente(paciente);
        atendimento.setProfissional(this);
        atendimento.setTipo("PROCEDIMENTO_BASICO");
        atendimento.setDescricao("Procedimento básico executado e apoio ao atendimento.");
        return atendimento;
    }
}
