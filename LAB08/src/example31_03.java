public class example31_03 {

    public static void printArray(int[]m, int i)
    {
        System.out.print("[" + m[i] + "]");

        if (i != m.length - 1)
        {
            ++i;
            printArray(m, i);
        }

    }

    public static void addArr(int []m) {
        int i = m.length - 1;
        int s = 1;

        if (i != m.length - 1)
        {
            m[i] = s;
            printArray(m, i);
            s++;
            i++;
        }

    }

    public static void main(String[] args) {
        int a[] = new int[] {1,2,3,4,5,6,7,8};

        printArray(a,0);
    }
}
