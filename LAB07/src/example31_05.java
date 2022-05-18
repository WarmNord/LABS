public class example31_05 {
    protected String s;

    public example31_05(String s) {
        this.s = s;
    }

    public void info() {
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println("Field value: " + this.s);
    }


}

class s_02 extends example31_05 {
    protected int i;

    public s_02(String s, int i) {
        super(s);
        this.i = i;
    }

    public void info() {
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println("Field value: " + this.s);
        System.out.println("Field value: " + this.i);
    }
}

class s_03 extends example31_05 {
    protected char c;

    public s_03(String s, char c) {
        super(s);
        this.c = c;
    }

    public void info() {
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println("Field value: " + this.s);
        System.out.println("Field value: " + this.c);
    }
}

    /*
    . В главном методе создайте объекты каждого из классов. Проверьте работу метода,
отображающего значения полей объектов, для каждого из объектов. Вызовите этот же
метод через объектную переменную суперкласса, которая ссылается на объект
производного класса.
     */
class Show {
        public static void main(String[] args) {
            example31_05 exSuper = new example31_05("Super");
            exSuper.info();
            System.out.println();

            s_02 sub2 = new s_02("SubClass", 02);
            sub2.info();
            System.out.println();

            s_03 sub3 = new s_03("SubClass",'E');
            sub3.info();
            System.out.println();


            example31_05 exTest = new example31_05("Объектная переменная суперкласса");
            exTest.info();
            System.out.println();

            exTest = new s_02("Sub - Объектная переменная суперкласса",02);
            exTest.info();
            System.out.println();

            exTest = new s_03("Sub - Объектная переменная суперкласса",'b');
            exTest.info();


        }
    }


