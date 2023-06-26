import java.util.*;
public class valid_pair {

    public static boolean validPair(String sh){
        Stack<Character> s = new  Stack<>();
        // boolean check = false;
        for(int i =0; i < sh.length(); i++){
            //opening case
            char ch = sh.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                // closing case
                if((s.peek() == '(' && ch == ')' )||(s.peek() == '{' && ch == '}' )
                    ||(s.peek() == '[' && ch == ']' )){
                    s.pop();
                }else{
                    return false;
                }

            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
        

    }

    public static void main(String[] args){
        String s = "([{})[]";
        System.out.print(validPair(s));
    }
    
}
