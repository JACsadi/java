 class Stack{
    int[] array= new int[1001];
    int sz = 0;
    public Stack() {
        for(int j = 0; j <1001;j++) this.array[j] = -100000000;
    }
   int top() {
         if(sz==0){ 
            System.out.println("Stack underflow");
            return -1;
         }
         return (this.array[sz-1]);
    }
    void pop() {
        if(sz==0){ 
            System.out.println("Stack underflow");}
         else {
            this.array[sz-1]=-100000000;
            sz--;
        }
        }
    void push( int j) {
        if(sz==1000){ 
            System.out.println("Stack overflow");}
         else {
            this.array[sz]=j;
            sz++;
        }
    }
    int size() {return sz;}
    boolean empty()
    {
        if(sz>0) return false;
        else  return true;
    }
}


public class StackImplement {
     public static void main(String[] args) {
               
       Stack  S = new Stack();
       S.push(9);
       S.push(8);
       S.push(12);

       System.out.println(S.size());

       System.out.println(S.top());
       S.pop();
       System.out.println(S.empty());
       S.pop();
       System.out.println(S.size());
       System.out.println(S.top());
       S.pop();
       System.out.println(S.empty());
       S.pop();
       System.out.println(S.size());


    }
    
}