import java.util.*;
public class pushatbottom {
    public static void pushBottom(Stack<Integer> s, int data){
        // base case 
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        // main code
        int top = s.pop();
        pushBottom(s,data);
        s.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }
        System.out.println("After pushing at bottom of the stack");

        pushBottom(s,4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        // System.out.println(s.peek());
    }
    
}
