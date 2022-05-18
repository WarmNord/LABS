public class example31_05 {

    static int recoursion(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return recoursion(n - 1) + n * n;
        }
    }

    static int cycle(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++)
            result += (int) Math.pow(i,2);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(example31_05.recoursion(3));
        System.out.println(example31_05.cycle(3));
    }
}
