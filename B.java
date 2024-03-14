public class B {
    private int i;
    public int j;
    int k;
    void m() {
        System.out.println(i+" "+j+" "+k);
    }
    public static void main(String[] arg) {
        B b = new B();
        System.out.println(b.i);
        System.out.println(b.j);
        System.out.println(b.k);
    }
}
class B2 {
    void m() {
        System.out.println(i+"  "+j);
    }
    public static void main(String[]) {
        D d = new D();
        System.out.println(d,j);
        System.out.println(d,k);
        D2 d2=new D2();
        d2,m();
    }
}