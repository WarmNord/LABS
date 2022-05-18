import java.util.Scanner;

public class example31_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введиде число: ");
        int i = input.nextInt();
        int i1 = i - 1;
        int i3 = i + 1;
        int i4 = (i + i1 + i3) * (i + i1 + i3);
        System.out.println(i1 + " " + i + " " + i3 + " " + i4);
    }
}
