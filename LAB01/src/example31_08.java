import java.util.Scanner;

public class example31_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введиде вашу Фамилию: ");
        String lastName = input.nextLine();

        System.out.print("Введиде ваше Имя: ");
        String firstName = input.nextLine();

        System.out.print("Введиде ваше Отчество: ");
        String secondName = input.nextLine();

        System.out.println("Hallo, " + lastName + " " + firstName + " " + secondName);
    }
}
