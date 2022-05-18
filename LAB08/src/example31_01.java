public class example31_01 {
    public static void main(String[] args) {
       // Rec1.m(1);
       //Rec2.m(1);
        Rec3.m(1);
        //System.out.println(Rec4.fact(1));
        //System.out.println(Rec5.f(1));
    }
}

class Rec1 {
    public static void m(int x) {
        System.out.println("x=" + x);
        if ((2 * x + 1) < 20) {
            m(2 * x + 1);
        }
    }
}

class Rec2 {
    public static void m(int x) {
        if ((2 * x + 1) < 20) {
            m(2 * x + 1);
        }
        System.out.println("x=" + x);
    }
}

class Rec3 {
    private static int step = 0;

    public static void m(int x) {
        space();
        System.out.println("" + x + "-> ");
        step++;
        if ((2 * x + 1) < 20) {
            m(2 * x + 1);
        }
        step --;
        space();
        System.out.println("" + x + " <-");
    }

    public static void space() {
        for (int i = 0; i < step; i++) {
            System.out.print(" ");
        }
    }

}

class Rec4 {
    public static int fact(int n){
        int result;
        if (n==1)
            return 1;
        else{
            result=fact(n-1)*n;
            return result;
        }
    }

}

class Rec5 {
    public static int f(int n){
        if (n==0){
            return 0;
        }else
        if (n==1){
            return 1;
        } else {
            return f(n-2)+f(n-1);
        }
    }

}