import java.util.*;
public class Next_Greater {
    public static int[] next_greater(int[] arr){
        int[] ans = new int[arr.length];
        int k = 0;
        for(int i=0; i<arr.length; i++){
            boolean check = false;
            for(int j= i+1; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    ans[k++] = arr[j];
                    check = true;
                    break;
                }
            }
            if(check == false){

                ans[k++] = -1;
            }
        }
        // ans[k++] = -1;


        return ans;
    }

    // an optimized code using stack 

    public static int[] next_greater_stack(int[] arr){
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[arr.length];
        int next_greater =0;
        for(int i= arr.length-1; i >= 0 ; i--){
            // step 1 
            while(!s.isEmpty() && s.peek()<= arr[i]){
                s.pop();
            }

            //step 2 

            if(s.isEmpty()){
                next_greater = -1;
            }else{
                next_greater = s.peek();
            }

            // step 3

            s.push(arr[i]);

            ans[i] = next_greater;
        }
        return ans;
    }
    public static void main(String[] args){
        int []  arr = {8,9,0,1,5,4};
        // arr = {6,8,0,1,3};
        arr = next_greater_stack(arr);
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
