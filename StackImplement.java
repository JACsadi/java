public class StackImplement {
    public static class Stack {
        int[] array= new int[1001];
        //Stack(int[] i) {this.array = i;};

       int top() {
             int sz = this.size();
             if(sz==0){ 
                System.out.println("Stack underflow");
                return -1;
             }
             return (this.array[sz-1]);

             
        }
        void pop() {
            int sz= this.size();
            if(sz==0){ 
                System.out.println("Stack underflow");}
             else {
                this.array[sz-1]=0;
            }
            }


        void push( int j) {
            int sz = this.size();
            if(sz==1000){ 
                System.out.println("Stack overflow");}
             else {
                this.array[sz]=j;
            }
        }
        int size()
        {
            int cnt=0;
            for( int i=0;i<1001;i++)
            {
                if(this.array[i]==0) {
                    cnt=i;
                    break;}

            }
            return (cnt);
        }
        
        boolean empty()
        {
            int sz=this.size();
            if(sz>0){
                return false;
            }
            else { return true;}

        }
    }

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