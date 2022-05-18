import java.util.Scanner;

public class example31_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int l = input.nextInt();

        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.println("Последовательность с помощью цикла for:");
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i <= l; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }

        System.out.println();
        System.out.println("Последовательность с помощью цикла while:");
        int m0 = 1;
        int m1 = 1;
        int m2;
        int i = 3;

        System.out.print(m0 + " " + m1 + " ");
        while (i <= l){
            m2 = m0 + m1;
            System.out.print(m2 + " ");
            m0 = m1;
            m1 = m2;
            i++;
        }
    }
}
