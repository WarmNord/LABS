public class example31_04 {
    private int x;
    private char c;

    public example31_04(int x, char c) {
        this.x = x;
        this.c = c;
    }

    public example31_04(double d) {
        int num = (int) d;
        c = (char) d;
        x = (int) Math.floor((d - num) * 100);
    }

}
