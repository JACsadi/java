 class Test {
 public static void main(String[] args) {
  int i = 0;
 B1: while(i <= 6 ) {
   int sum = 0;i++;
   B2: for(int j = 1,k=1; j<=i;) {
      sum  = sum + j++;
      for(;k<=j;k++) {
         if(k%2 ==0) continue ;
         sum = sum + k;
         if(sum > 50 ) break B2;
      }
      if(i==3) continue B1;
   }
   System.out.println(sum);
  }
 }
}