import java.util.*;
public class maxActivity {
    public static void maxActivity(){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,8,9,9};

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        maxAct = 1;

        int lastend = end[0];

        for(int i=1; i < start.length; i++){
            if(start[i] >= lastend){
                maxAct++;
                lastend = end[i];
                ans.add(i);
            }
        }

        for(int i=0; i <ans.size(); i++){
            System.out.print(ans.get(i) + " ");
            

        }
        System.out.println("Total " + maxAct + " performed");
    }
    public static void main(String[] args){
        maxActivity();

    }
    
}
