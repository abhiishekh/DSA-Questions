import java.util.*;
public class reversestack {
    public static void pushatbottom(Stack<Integer>s,int data){
        //base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        // biolerplate code
        int top = s.pop();
        pushatbottom(s,data);
        s.push(top);

    }
    public static void  reversestack(Stack<Integer> s){
        // base case 
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reversestack(s);
        pushatbottom(s,top);
    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reversestack(s);
        while(!s.isEmpty()){
            System.out.print(s.peek()+ " ");
            s.pop();
        }
    }
    
}
