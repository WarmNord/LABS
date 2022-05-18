public class example31_01 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка"); // брошено исключение
        } catch (RuntimeException e) { // исключение перехвачено
            System.out.println("1 " + e); // исключение обработано
        }
        System.out.println("2");
    }
}

class ex_02 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка"); // брошено исключение
            //System.out.println("1");
        } catch (Exception e) { // исключение перехвачено
            System.out.println("2 " + e);// исключение обработано
        }
        System.out.println("3");
    }
}

class ex_03 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка"); // брошено исключение
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (RuntimeException e) { // исключение обработано т.к было брошено RuntimeException
            System.out.println("2"); // исключение обработано
        } catch (Exception e) {
            System.out.println("3");
        }
        System.out.println("4");
    }
}

class ex_04 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка"); // брошено исключение
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (Exception e) { // исключение перехвачено
            System.out.println("2"); // исключение обработано т.к было брошено RuntimeException
        } catch (Error e) {
            System.out.println("3");
        }
        System.out.println("4");

    }
}

class ex_05 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка"); // брошено исключение
        } catch (NullPointerException e) { // исключение не будет перехвачено т.к. брошено RuntimeException
            System.out.println("1");
        }
        System.out.println("2");

    }
}

class ex_06 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка"); // брошено исключение
        } catch (ArithmeticException e) {
            System.out.println("1");
        } catch (Exception e) {
            System.out.println("2");
       // } catch (RuntimeException e) { // исключение не будет перехвачено т.к. ArithmeticException потомок RuntimeException
            System.out.println("3");
        }
        System.out.println("4");
    }
}

class ex_07 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка"); // брошено исключение NPE
        } catch (NullPointerException e) { // исключение NPE перехвачено
            System.out.println("1");
            throw new ArithmeticException(); // брошено исключение ArithmeticException
        } catch (ArithmeticException e) { // исключение ArithmeticExceptionне будет прехвачено т.к. отсутсвует обработчик для брошенного AE в 95 строке
            System.out.println("2");
        }
        System.out.println("3");
    }
}

class ex_08 {
    public static int m(){
        try {
            System.out.println("0");
            throw new RuntimeException(); // брошено исключение RuntimeException , но нет catch блока перехвата
        } finally { // секция выполняется всегда
            System.out.println("1");
        } }
    public static void main(String[] args) {
        System.out.println(m());
    }
}

class ex09 {
    public static int m(){
        try {
            System.out.println("0");
            return 55; // выход из метода, возврат значения метода
        } finally {
            System.out.println("1"); // секция выполняется всегда
        } }
    public static void main(String[] args) {
        System.out.println(m());
    }
}

class ex10 {
    public static int m(){
        try {
            System.out.println("0");
            return 15; // выход из метода не выполняется
        } finally { // секция выполняется всегда
            System.out.println("1");
            return 20; // выход из метода, возврат значения метода
        } }
    public static void main(String[] args) {
        System.out.println(m());
    }
}

class ex11 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка"); // брошено исключение NullPointerException
        } catch (NullPointerException e) { // исключение NPE перехвачено
            System.out.println("1" );
        }finally { // секция выполняется всегда
            System.out.println("2" );
        }
        System.out.println("3");
    }
}

class ex12 {
    public static void m(String str, double chislo){
        if (str==null) {
            throw new IllegalArgumentException("Строка введена неверно"); // брошено исключение IllegalArgumentException, отсутвует перехват и обработка исключения
        }
        if (chislo>0.001) {
            throw new IllegalArgumentException("Неверное число"); // брошено исключение IllegalArgumentException, отсутвует перехват и обработка исключения
        } }
    public static void main(String[] args) {
        m(null,0.000001);
    }
}

class ex13 {
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива= " + l);
            int h=10/l;
            args[l + 1] = "10";
        } catch (ArithmeticException e) { // исключение ArithmeticException из блока выше перехвачено (при установке аргумента 0,55)
            System.out.println("Деление на ноль"); // исключение ArithmeticException обработано
        }catch (ArrayIndexOutOfBoundsException e) { // исключение ArrayIndexOutOfBoundsException из блока выше перехвачено(если значнеие аргумента не установлено)
            System.out.println("Индекс не существует"); // исключение ArrayIndexOutOfBoundsException обработано
        } }

}

class ex14 {
    public static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got " + String.valueOf(x));
        } else return Math.sqrt(x); // your implementation here
    }
    public static void m(int x) throws ArithmeticException{ //c помощью оператора throw выбрасывается исключение ArithmeticException
        int h=10/x;
    }
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива= " + l);
            m(l);
        } catch (ArithmeticException e) { //исключение ArithmeticException из метода выше перехвачено см. 186 строку кода
            System.out.println("Ошибка: Деление на ноль");
        }
    }
}

