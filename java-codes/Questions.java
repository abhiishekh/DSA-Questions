import java.util.*;
public class Questions {

    //print all binary numbers of a given number N

    // // public static void binary(int N){
    //     Stack<Integer> s = new Stack<>();
    //     for(int i=1; i <= N; i++){

    //         while(i>0){
    //             s.push(i%2);
    //             i = i%2;
    
    //         }
    //         while(!s.isEmpty()){
    //             System.out.print(s.pop());
    //         }
    //         System.out.print(" ");
    //     }

    // }
    

    public static void main(String[] args) {
    // int N = 5;
    String s = "([]){";
    
    // for (int i = 1; i <= N; i++) {
    //     int binary = 0;
    //     int power = 1;
        
    //     while (i > 0) {
    //         int remainder = i % 2;
    //         binary += remainder * power;
    //         i = i / 2;
    //         power *= 10;
    //     }
        
    //     System.out.print(binary + " ");
    // }
    System.out.print(isValid(s));
    }

    
}
