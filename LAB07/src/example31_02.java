public class example31_02 {
    private String s1;

    public example31_02(String s1) {
        this.s1 = s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public void setS1() {
    }

    public int getS1() {
        return s1.length();
    }

}

class sub extends example31_02 {
    public int nubmer;

    public sub(String s1,int nubmer) {
        super(s1);
        this.nubmer = nubmer;
    }

    @Override
    public void setS1(String s1) {
        super.setS1(s1);
    }

    @Override
    public void setS1() {
        super.setS1();
    }


    public void setS1(int number) {
        this.nubmer = nubmer;
    }

    public void setS1(String s1, int number) {
        super.setS1(s1);
        this.nubmer = nubmer;
    }

}
