public class example31_01 {
    private char s;

    public void setS(char value) {
        s = value;
    }

    public int getS() {
        int code = (int) s;
        return code;
    }

    public void description() {
        System.out.println("Символ: " + s + ", Код символа: " + getS());
    }

}
