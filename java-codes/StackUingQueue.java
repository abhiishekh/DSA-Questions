import java.util.*;
public class StackUingQueue {
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        // is empty()
        public static boolean isEmpty(){ //O(1)
            return q1.isEmpty();
        }

        //add

        public static void push(int data){ // O(n)
            if(q1.isEmpty()){
                q1.add(data);
            }else{
                while(!q1.isEmpty()){
                    q2.add(q1.remove());
                }
                q1.add(data);
                 while(!q2.isEmpty()){
                    q1.add(q2.remove());
                }
            }
        }

        // remove

        public static int pop(){ //O(1)
            return q1.remove();

        }
        public static int peek(){ //O(1)
            return q1.peek();
        }
    }

    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        System.out.println(s.pop());
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    
}
