public class example31_01 {
    private String s1;

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public example31_01(String s1) {
        this.s1 = s1;
    }

    public example31_01() {
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getS1();
        return superClassNameAndFieldValue ;

    }
}

class s2 extends example31_01 {
    private String s2;

    public s2(String s1, String s2) {
        super(s1);
        this.s2 = s2;
    }

    public s2(String s2) {
        this.s2 = s2;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "Sub class" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                //" str 1 = " + this.getS1() + "\n" +
                " str 2 = " + this.getS2() + "\n";
        return ClassNameAndFieldValue ;

    }


    public static void main(String[] args) {
        example31_01 ex01 = new example31_01("передал в конструктор суперкласса ");
        String s1 = ex01.toString();
        System.out.print(s1);
        System.out.println();

        //передал в конструктор подкласса

        example31_01 sub_ex01 = new s2("передал в конструктор подкласса");
        String s2 = sub_ex01.toString();
        System.out.print(s2);
    }
}
