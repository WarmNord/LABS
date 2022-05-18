import java.util.Scanner;

public class example31_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введиде ваше Имя: ");
        String firstName = input.nextLine();

        System.out.print("Введиде ваш Возраст: ");
        int age = input.nextInt();

        System.out.println("Имя: " + firstName + " Возраст: " + age);
    }
}
