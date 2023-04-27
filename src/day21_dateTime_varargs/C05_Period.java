package day21_dateTime_varargs;
import java.time.LocalDate;
import java.time.Period;
public class C05_Period {
    public static void main(String[] args) {
        LocalDate dogumtarihi= LocalDate.of(1989,7,15);
        LocalDate bugun= LocalDate.now();
        Period yasEnes = Period.between(dogumtarihi,bugun);
        System.out.println(yasEnes); // P 33Y 9M 10D
        System.out.println("Enes'in yasi : "+yasEnes.getYears());
    }
}
