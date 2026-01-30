package Model;

import java.util.Date;

public class TecnicoEnfermagem extends ProfissionalSaude{
    public TecnicoEnfermagem(int id, String nome, String cpf, Date dataNascimento, String telefone, int registroProfissional, String especialidade) {
        super(id, nome, cpf, dataNascimento, telefone, registroProfissional, especialidade);
    }
}
