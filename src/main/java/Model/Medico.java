package Model;

import java.util.Date;

public class Medico extends Pessoa{
    public Medico(int id, String nome, String cpf, Date dataNascimento, String telefone) {
        super(id, nome, cpf, dataNascimento, telefone);
    }
}
