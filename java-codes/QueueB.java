public class QueueB {

    // public class Queue{
        static int arr[];
        static int size;
        static int rear;
        QueueB(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        public boolean isEmpty(){
            if(rear == -1){
                return true;
            }
            return false;
            //or 
            // return rear == -1;
        }
        public void add(int data){
            if(rear == size-1){
                System.out.print("Queue is full");
                return;
            }  
            rear  = rear+1;
            arr[rear] = data;
        }
        //remove
        public int remove(){
            if(isEmpty()){
                System.out.print("Queue is allready empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i < rear; i++){
                arr[i] = arr[i+1];
            }
            rear = rear-1;
            return front;
        }
        public int peek(){
            if(isEmpty()){
                System.out.print("Queue is empty");
                return -1;
            }
            return arr[0];
        }
        

    // }
    public static void main(String[] args){
        QueueB q = new QueueB(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        

    }
    
}