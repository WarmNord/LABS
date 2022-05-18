public class example31_02 {
    private static int num = 0;

    static void showNum(){
        System.out.println(num);
        num++;
    }

    public static void main(String[] args) {
        example31_02.showNum();
        example31_02.showNum();
        example31_02.showNum();
        example31_02.showNum();

    }
}
