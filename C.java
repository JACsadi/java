class C2 {int i = 100;}
public class C {
    void m() {System.out.println("C.m1");}
    void m(int i) {
        System.out.println("C.m2");
    }
    void m(int i,int j) {
        System.out.println("C.m3");
    }
    void m(C2 c2) {
        System.out.println("C.m4");
    }
    public static void main(String[] args) {
         C c = new C();
         c.m();
         c.m(1);
         c.m()
    }
}