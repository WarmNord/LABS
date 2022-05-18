import java.util.Calendar;
import java.util.Scanner;

public class example31_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Введиде год вашего рождения полностью(напр. 1995): ");
        int yearOfBirth = input.nextInt();

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        int ageUser = currentYear - yearOfBirth;

        System.out.println("Ваш возраст: " + ageUser);
    }
}
