import java.util.Calendar;
import java.util.Scanner;

public class example31_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введиде ваше Имя: ");
        String firstName = input.nextLine();

        System.out.print("Введите год вашего рождения полностью(напр. 1995): ");
        int yearOfBirth = input.nextInt();

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        int ageUser = currentYear - yearOfBirth;

        System.out.println(firstName +" возраст: "+ ageUser );
    }
}
