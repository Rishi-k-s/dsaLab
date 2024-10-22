class Oombi{
    int a;
    int ab;
}

public class Test {
    public static void main(String[] args) {
        Oombi a = null;
        Oombi b = new Oombi();
        a=b;
        a.ab = 1;
        System.out.println(a);
        System.out.println(b);
    }
}
