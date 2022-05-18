import java.util.Scanner;

public class example31_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число");
        String s = input.nextLine();

        System.out.println(Integer.parseInt(s.substring(0,1)));
    }
}
