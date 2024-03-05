public class ArrayTest {
    public static void main(String[] args) {
    //     int[] a;
    //     a = new int[10];
    //     System.out.println(a[0]);
    //     // System.out.println(a[10]);
    //    byte[] b = new byte[10];
    //     System.out.println(b);
    //     byte[] b2 = b;
    //     System.out.println(b2);
    //     b[4] = 100;
    //     System.out.println(b2[4]);
    //     var bl = new boolean[10];
    //     for(var bln:bl) {
    //       System.out.println(bln);
    //     }
    //     double[][] d = new double[5][5];
        // for(double[] d1:d) {
        //     for(double d2:d1) {
        //         System.out.print(d2 + " ");
        //     }
        //     System.out.println();
        // }
    //     for(int i = 0; i < d.length; i++) {
    //         for(int j = 0; j < d[i].length;j++)   System.out.print(d[i][j] + " ");
    //         System.out.println();
    //     }
    // }
    // float[][] f =  new float[5][];
    // f[0] = new float[1];
    // f[1] = new float[2];
    // f[2] = new float[3];
    // f[3] = new float[4];
    // f[4] = new float[5]; 
    // for(float [] f1:f) {
    //     for(float  f2:f1) {
    //         System.out.print(f2 + " ");
    //     }
    //     System.out.println();
    // }
    // for(int i = 0; i < f.length; i++) {
    //     for(int j = 0; j < f[i].length;j++)   System.out.print(f[i][j] + " ");
    //     System.out.println();
    // }
    // char[] c = {'A','B','C'};
    // for(char c1:c) System.out.print(c1);
    char[][] c2 = {{'A','B','C'}, {'a','b'}, {'1','2'}};
    for(char[] c:c2) {
        for(char c1:c) System.out.print(c1);
        System.out.println();
        
    }
}
}