import java.util.Scanner;

public class example31_02 {
    public static void main(String[] args)
    {
        int n;
        String x;

        Scanner s = new Scanner(System.in);
        System.out.print("Введите число: ");
        n = s.nextInt();
        example31_02 obj = new example31_02();
        x = obj.binary(n);
        System.out.println("Число в двоичной системе: "+x);
    }
    String binary(int y)
    {
        int a;
        if(y > 0)
        {
            a = y % 2;
            return (binary(y / 2) + "" +a);
        }
        return "";

    }
}
