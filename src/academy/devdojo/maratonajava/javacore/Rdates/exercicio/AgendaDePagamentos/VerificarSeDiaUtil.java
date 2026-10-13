package academy.devdojo.maratonajava.javacore.Rdates.exercicio.AgendaDePagamentos;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class VerificarSeDiaUtil {
    public static LocalDate verificarSeDiaUtil(LocalDate data){
        int addDays;
        if(data.getDayOfWeek() == (DayOfWeek.SATURDAY)) {
            addDays = 2;
        }else if(data.getDayOfWeek() == (DayOfWeek.SUNDAY)){
            addDays = 1;
        }else{
            addDays = 0;
        }
        return data.plusDays(addDays);
    }
}
