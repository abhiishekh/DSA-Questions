public class CircularQ {

    // public class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        CircularQ(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        public boolean isEmpty(){
            if(rear == -1 && front == -1){
                return true;
            }
            return false;
            //or 
            // return rear == -1;
        }

        public boolean isFull(){
            if((rear+1)%size == front){
                return true;
            }
            return false;
        }

        public void add(int data){
            if(isFull()){
                System.out.print("Queue is full");
                return;
            }  
            if(front ==-1){
                front++;
            }
            rear  = (rear+1)%size;
            arr[rear] = data;
        }
        //remove
        public int remove(){
            if(isEmpty()){
                System.out.print("Queue is allready empty");
                return -1;
            }
            // int front = arr[0];
            int result = arr[front];
            // rear = rear-1;
            //last  element delete
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1) % size;   
            }
            return result;
        }
        public int peek(){
            if(isEmpty()){
                System.out.print("Queue is empty");
                return -1;
            }
            return arr[front];
        }
        

    // }
    public static void main(String[] args){
        CircularQ q = new CircularQ(5);
        q.add(1);
        q.add(2);
        q.add(3);
        // q.remove();
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        

    }
    
}
