public class example31_01 {
    private char symb;
    private String str;

    void set(char c) {
        this.symb = c;
    }


    void set(String s) {
        this.str = s;
    }

    void set(char i[]) {
        String fs = "";
        if (i.length < 2) {
            this.symb = i[0];
        } else {
            for (char futureString : i
            ) {
                fs += Character.toString(futureString);
            }
        }
        set(fs);
    }

    public static void main(String[] args) {
        example31_01 ex01 = new example31_01();
        ex01.set('g');
        System.out.println(ex01.symb);

        ex01.set("gggg");
        System.out.println(ex01.str);
        char[] ch = {'f', 'j'};
        ex01.set(ch);
        System.out.println(ex01.symb);
        System.out.println(ex01.str);

    }


}
