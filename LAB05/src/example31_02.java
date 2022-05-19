public class example31_02 {
    private char firstSymbol = 'A';
    private char lastSymbol = 'G';

    public void pSymbols() {
        for (char i = firstSymbol; i <= lastSymbol; i++) {
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        example31_02 ex = new example31_02();
        ex.pSymbols();
    }

}
