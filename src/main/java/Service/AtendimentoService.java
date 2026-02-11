package Service;
package Service;

import Model.Atendimento;
import Model.Paciente;
import Model.ProfissionalSaude;

public class AtendimentoService {

    public Atendimento realizarAtendimento(
            Paciente paciente,
            ProfissionalSaude profissional
    ) {

        return profissional.atenderPaciente(paciente);
    }
}