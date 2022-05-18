public class example31_04 {
    static int factR(int n) {
        int result;
        if (n <= 1) {
            return 1;
        } else {
            return n * factR(n - 2);
        }
    }

    static int factC(int n) {
        int result = 1;
        for (int i = n % 2 == 0 ? 2 : 1; i <= n; i += 2)
            result *= i;
        return result;
    }

    public static void main(String[] args) {

        System.out.println(example31_04.factR(6));
        System.out.println(example31_04.factC(6));
    }
}
