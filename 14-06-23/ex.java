// package 14-06-23;

public class ex {
    public static int removeElement(int[] nums, int val) {
        int count=0;
        int j =0;
        int n = nums.length;
        for(int i = 0 ; i < n; i++){
            if(nums[i] == val){
                j = i;
                while(j < n-1){
                    nums[j] = nums[j+1];
                    j++;
                   
                }
                nums[n-1] = 0;
                n--;
                i--;
            }
        }
        j = n;
        return j;
        
    }
    public static void main(String[] args){
        int [] nums = {3,2,2,3};

        System.out.print(removeElement(nums,3));
    }
}
