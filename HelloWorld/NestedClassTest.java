public class NestedClassTest {
    int a = 100; static int i = 10;
    class Inner {
        int b = 200;
        void m() {
            System.out.println(a+" "+b+" "+i);
        }
    }
    static class StaticNested {
        int c = 300;
        void m2() {
            System.out.println(i);
        }
    }
    void display() {
        Inner n = new Inner();
        System.out.println(n.b);
        n.m();
        StaticNested sn = new StaticNested();
        sn.m2();
    }
    public static void main(String[] args) {
        NestedClassTest nc = new NestedClassTest();
        nc.display();
        Inner in = nc.new Inner();
        StaticNested sn = new StaticNested();
    }
}
class N2 {
    public static void main(String[] args) {
      NestedClassTest.StaticNested sn = new NestedClassTest.StaticNested();
      NestedClassTest nc = new NestedClassTest();
      NestedClassTest.Inner in = nc.new Inner(); 
    }
}