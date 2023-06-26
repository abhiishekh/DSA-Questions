import java.util.*;
public class stack_linkedList{
    // public static class Node{
    //     int data;
    //     Node next;
    //     public Node(int data){
    //         this.data = data;
    //         this.next = null;
    //     }
    // }

    

    // public static class Stack{
    //     static Node head = null;
    //     static Node tail;
    //     // isEmpty()

    //     public static boolean isEmpty(){
    //         if(head == null){
    //             return true;
    //         }
            
    //         return false;
    //     }

    //     // push() 

    //     public static void push(int data){
    //         Node newNode = new Node(data);

    //         if(head == null){
    //             head = tail = newNode;
    //             return;
    //         }
    //         newNode.next = head;
    //         head = newNode;
    //     }

    //     //pop()

    //     public static int pop(){
    //         if(isEmpty()){
    //             System.out.print("Stack is empty");
    //             return 0;
    //         }
    //         Node temp = head;
    //         int top = head.data;
    //         head = head.next;
            
    //         return top;

    //     }
    //     //peek()

    //     public static int peek(){
    //         return head.data;
    //     }
        
        
    // }
    public static void main(String[] args){
        // Stack s = new Stack();
        Stack<Integer> s  = new Stack();
        System.out.println(s.isEmpty());
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();

        }


    }
}