public class OperatorTest {
    public static void main(String[] args) {
        int i = -10; double d = 57.84;
        // System.out.println(i%10);
        // System.out.println(d%10);
        // System.out.println("Unary not =  ~"+i+" = "+ ~i);
        // System.out.println(Integer.toBinaryString(i));
        // System.out.println(Integer.toBinaryString( ~i));
        byte a = 23,b = 17;
        // System.out.println("Bitwise OR = "+a+"|"+b+" = "+ (a|b));
        // System.out.println(Integer.toBinaryString(a));
        // System.out.println(Integer.toBinaryString(b));
        // System.out.println(Integer.toBinaryString(a|b));
        // System.out.println("Bitwise AND = "+a+"&"+b+" = "+ (a&b));
        // System.out.println(Integer.toBinaryString(a));
        // System.out.println(Integer.toBinaryString(b));
        // System.out.println(Integer.toBinaryString(a&b));
        // System.err.println("BEFORE LEFT SHIFT i = "+Integer.toBinaryString(i)+" AFTER LEFT SHIFT i<<2 = "+Integer.toBinaryString(i<<2));
        // System.err.println("BEFORE LEFT SHIFT i = "+Integer.toBinaryString(i)+" AFTER LEFT SHIFT i>>2 = "+Integer.toBinaryString(i>>2));
        System.err.println("BEFORE UNSIGNED RIGHTSHIFT i = "+Integer.toBinaryString(i)+" AFTER LEFT SHIFT i>>>2 = "+Integer.toBinaryString(i>>>2));
        boolean b1 = true , b2 = false;
        System.out.println(b1&b2);
        System.out.println(b1|b2);
        System.out.println(b1^b2);
        System.out.println(!b1);
        System.out.println(b1&&b2);
        System.out.println(b1||b2);
        int x,y,z;
        x = y = z;
        x = y>z ? 100 : 50;
    }
}