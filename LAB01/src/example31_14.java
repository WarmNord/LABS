import java.util.Calendar;
import java.util.Scanner;

public class example31_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введиде ваш Возраст: ");
        int age = input.nextInt();

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        int userDateOfBirth = currentYear - age;

        System.out.println("Ваш год рождения: " + userDateOfBirth);
    }
}
