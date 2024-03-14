import java.io.IOException;
public class ConditionalStTest {
    public static void main(String[] args)  throws java.io.IOException { 
            int inChar;
            System.out.println("Enter a Character:");
            int ans = 0;
            int k = 0;
            while(true) {
                inChar = System.in.read();
                // System.out.print("You entered ");
                // System.out.println(inChar);
                if(inChar == 13) {
                    ans += k;
                    inChar = System.in.read();
                    k = 0;
                } else if(inChar == 69) {
                    inChar = System.in.read();
                    inChar = System.in.read();
                    inChar = System.in.read();
                    inChar = System.in.read();
                    break;
                } else {
                    k *= 10;
                    k += inChar - 48;
                }
        }
        System.out.println(ans);`
    }
    }
