public class StaticTest {
    static int a,b = 100;
    static void m() {System.out.println("m()");}
    {System.out.println("blalal");};
    static  {System.out.println("snjhc");};
    public static void main(String[] args) {
        System.out.println("Main1");
        System.out.println(StaticTest.a);
        System.out.println(StaticTest.b);
        m();
        StaticTest s = new StaticTest();
        StaticTest s1 = new StaticTest();
        StaticTest s2 = new StaticTest();
        System.out.println(s.a);
        System.out.println(s.b);
        StaticTest.a += 50;
        System.out.println(s.a);
        s.a += 50;
        System.out.println(s.a);
        System.out.println(StaticTest.a);
    }
}
class S2 {
    public static void main(String[] args) {
        System.out.println("alu");
        int a = StaticTest.a;
    }
}