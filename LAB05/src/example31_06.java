public class example31_06 {
    private int max;
    private int min;

    public example31_06(int n) {
        set(n);
    }

    public example31_06(int n1, int n2) {
        set(n1, n2);
    }

    public void set(int n1) {
        min = Math.min(min, n1);
        max = Math.max(max, n1);
    }

    public void set(int n1, int n2) {
        min = Math.min(n1, n2);
        max = Math.max(n1, n2);

    }

    public void info() {
        int mi = min;
        int ma = max;
        System.out.println("min: " + mi);
        System.out.println("max: " + ma);
    }

}
