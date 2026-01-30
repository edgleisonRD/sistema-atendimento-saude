package Model;

import java.util.Date;

public class Enfermeiro extends ProfissionalSaude{
    public Enfermeiro(int id, String nome, String cpf, Date dataNascimento, String telefone, int registroProfissional, String especialidade) {
        super(id, nome, cpf, dataNascimento, telefone, registroProfissional, especialidade);
    }

    @Override
    public Atendimento atenderPaciente(Paciente paciente) {

        Atendimento atendimento = new Atendimento();
        atendimento.setPaciente(paciente);
        atendimento.setProfissional(this);
        atendimento.setTipo("TRIAGEM");
        atendimento.setDescricao("Triagem realizada, sinais vitais coletados e risco classificado.");
        return atendimento;
    }
}
