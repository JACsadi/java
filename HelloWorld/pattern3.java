class pattern3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for(int i = n; i>= 1; i--) {
           for(int j = 1; j < i; j++) {
            System.out.print(" ");
           }
           for(int j = i; j <= n; j++) {
             System.out.print(j);}
             for(int j = n-1; j >= i; j--) {
                System.out.print(j);}
                for(int j = 1; j <i; j++) {
                    System.out.print(" ");
                   }  
                   System.out.print("\n");
        }
    }
}