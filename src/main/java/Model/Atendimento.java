package Model;

public class Atendimento {
    private Paciente paciente;
    private ProfissionalSaude profissional;
    private String tipo;
    private Date data;
    private String descricao;
    public Atendimento(){}

    public Atendimento(Paciente paciente, ProfissionalSaude profissional, String tipo, Date data, String descricao) {
        this.paciente = paciente;
        this.profissional = profissional;
        this.tipo = tipo;
        this.data = new Date();
        this.descricao = descricao;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public ProfissionalSaude getProfissional() {
        return profissional;
    }

    public void setProfissional(ProfissionalSaude profissional) {
        this.profissional = profissional;
    }

    public Date getData() {
        return data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}

