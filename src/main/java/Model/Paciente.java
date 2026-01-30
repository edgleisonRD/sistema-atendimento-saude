package Model;

import java.util.Date;

public class Paciente extends Pessoa{
    private int numeroProntuario;
    private String tipoConvenio;

    public Paciente(int id, String nome, String cpf, Date dataNascimento, String telefone, int numeroProntuario, String tipoConvenio) {
        super(id, nome, cpf, dataNascimento, telefone);
        this.numeroProntuario = numeroProntuario;
        this.tipoConvenio = tipoConvenio;
    }

    public int getNumeroProntuario() {
        return numeroProntuario;
    }

    public void setNumeroProntuario(int numeroProntuario) {
        this.numeroProntuario = numeroProntuario;
    }

    public String getTipoConvenio() {
        return tipoConvenio;
    }

    public void setTipoConvenio(String tipoConvenio) {
        this.tipoConvenio = tipoConvenio;
    }
}
