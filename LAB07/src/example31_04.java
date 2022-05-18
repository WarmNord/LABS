class example31_04 {
    public char ch1;

    public example31_04(char ch1) {
        this.ch1 = ch1;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class sub2 extends example31_04 {
    public String s2;

    public sub2(char ch1, String s2) {
        super(ch1);
        this.s2 = s2;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return sub2.super.clone();
    }
}

class sub3 extends sub2 {
    public int i3;

    public sub3(char ch1, String s2, int i3) {
        super(ch1, s2);
        this.i3 = i3;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return sub3.super.clone();
    }
}