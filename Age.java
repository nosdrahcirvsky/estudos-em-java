import java.time.LocalDate;
import java.time.Period;

public class Age {
    public static void main(String args[]) {
        int month = 10;
        int year = 1997;
        int day = 11;
        
        LocalDate today = LocalDate.now();
        LocalDate bday = LocalDate.of(year, month, day);
        int age = Period.between(bday, today).getYears();

        // Condicional para exibir uma mensagem de parabéns
        if (day == today.getDayOfMonth() && month == today.getMonthValue()) {
            System.out.println("Parabéns! Você está fazendo " + age + " anos =)");
        } else {
            System.out.println("Sua idade: " + age);
        }
    }
}
