import java.util.Stack;

public class QuesWithStack{
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // public static boolean isEmpty(){
        //     return s1.isEmpty();
        // }
        // //add function
        // public static void add(int data){ // O(n)
        //     if(s1.isEmpty()){
        //         s1.push(data);

        //     }else{
        //         while(!s1.isEmpty()){
        //             s2.push(s1.peek());
        //             s1.pop();
        //         }
        //         s1.push(data);
        //         while(!s2.isEmpty()){
        //             s1.push(s2.peek());
        //             s2.pop();
        //         }
        //     }
        // }
        // //remove

        // public static int pop(){ //O(1)
        //     if(s1.isEmpty()){
        //         return -1;

        //     }
        //     return s1.pop();
        // }


        // another way to implement it 
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void add(int data){
            s1.push(data);
        }
        public static int pop(){
            while(!s1.isEmpty()){
                s2.push(s1.pop());

            }
            int pop= s2.pop();
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return pop;
        }
    }



    public static void main(String[] args){

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("item " + q.pop() + " is deleted");
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(" " + q.pop());
        }


        
    }
}