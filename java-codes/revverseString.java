import java.util.*;
public class revverseString {
    public static void main(String[] args){
        Stack<Character> s = new Stack();

        int idx =0;
        String sh = "abcdef";
        while(idx <sh.length()){
            s.push(sh.charAt(idx));
            idx++;
        }
        while(!s.isEmpty()){
            System.out.print(s.peek());
            s.pop();
        }
    }
    
}
