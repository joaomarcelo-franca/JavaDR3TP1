package Metodos;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class VerificacaoIdade {
    public static int calcularIDade(int anoDeNascimento){
        Calendar calendar = GregorianCalendar.getInstance();
        return calendar.get(Calendar.YEAR) - anoDeNascimento;
    }
}
