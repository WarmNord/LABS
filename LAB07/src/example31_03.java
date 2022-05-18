public class example31_03 {
    public int number;

    public example31_03(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " Field value = " + this.number + "\n";
        return superClassNameAndFieldValue;
    }

}

class sub_2 extends example31_03 {
    public char ch;

    public sub_2(int number, char ch) {
        super(number);
        this.ch = ch;
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Sub 2" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " Field value = " + this.number + "\n" +
                " Field value = " + this.ch + "\n";
        return superClassNameAndFieldValue;
    }

}

class sub_3 extends sub_2 {
    public String s;

    public sub_3(int number, char ch, String s) {
        super(number, ch);
        this.s = s;
    }

    public void setS(int number, char ch, String s) {
        this.s = s;
        this.ch = ch;
        this.number = number;
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Sub 3" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " Field value = " + this.number + "\n" +
                " Field value = " + this.ch + "\n" +
                " Field value = " + this.s + "\n";
        return superClassNameAndFieldValue;
    }

    public static void main(String[] args) {
        example31_03 ex03 = new example31_03(1);
        String s1 = ex03.toString();
        System.out.print(s1);
        System.out.println();

        example31_03 sub_2 = new sub_2(2,'q');
        String s2 = sub_2.toString();
        System.out.print(s2);
        System.out.println();

        example31_03 sub_3 = new sub_3(3,'q',"z");
        String s3 = sub_3.toString();
        System.out.print(s3);


    }
}

