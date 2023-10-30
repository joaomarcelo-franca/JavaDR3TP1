package Pessoa;

import Metodos.VerificacaoIdade;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Pessoa {
    private int anoDeNascimento = 2007;
    private int idade = VerificacaoIdade.calcularIDade(anoDeNascimento);
    private boolean maiorDeIDade = false;
}
