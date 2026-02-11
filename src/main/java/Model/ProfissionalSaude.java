package Model;

import java.util.Date;

public abstract class ProfissionalSaude extends Pessoa {
    private int registroProfissional;
    private String especialidade;
    ProfissionalSaude profissional = new Medico();
    AtendimentoService service = new AtendimentoService();
    Atendimento atendimento = service.realizarAtendimento(paciente, profissional);

    public ProfissionalSaude(int id, String nome, String cpf, Date dataNascimento, String telefone, int registroProfissional, String especialidade) {
        super(id, nome, cpf, dataNascimento, telefone);
        this.registroProfissional = registroProfissional;
        this.especialidade = especialidade;
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public abstract Atendimento atenderPaciente(Paciente paciente);
}
