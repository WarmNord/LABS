public class example31_18 {

    static double a = 10.0, b = 4.0, c, resultPow;

    public static double hyp() {
        return c = Math.sqrt(a * a + b * b);
    }

    static double hyp_new() {
        return resultPow = Math.exp(b * Math.log(a));
    }

    public static void main(String[] args) {
        System.out.println("katet а=" + a);
        System.out.println("katet b=" + b);
        System.out.println("hypotenuse с=" + hyp());
        System.out.println("Pow=" + hyp_new());
    }
}
