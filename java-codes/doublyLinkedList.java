

public class doublyLinkedList{
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static Node size;
    public void insertNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;

        }
        newNode.prev = temp;
        temp.next = newNode;
        // size++;
        // temp = temp.next;
    }
    public int removeFirst(){
        if(head == null){
            System.out.print("head is null ");
            return 0;
        }
        if(head.next == null){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;
    }
    public void reverse(){
        if(head == null){
            return;
        }

        Node curr = head;
        Node next ;
        Node prev = null;

        while(curr!= null){
            next = curr.next;
            curr.next = prev;

            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;

    }
    // making the list as even first and then odd 
    public void evenOdd(Node head){
        if(head == null) {
            return ;
        }

        Node temp1 = new Node(-1);
        Node temp2 = new Node(-1);
        Node temp = temp2.next;

        Node newHead = head;
        while(newHead != null){
            Node newnode = new Node(newHead.data);
            if(newHead.data%2 == 0){
                temp1.next = newnode;
            }else{
                temp2.next = newnode;
            }
            newHead = newHead.next;
        }

        temp1.next = temp;
        head = temp1.next;
        // return head;
        
    }
    public void display(){
        if(head == null){
            System.out.print("lsit is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " <->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();

    }
    public static void main(String[] args){
        doublyLinkedList dll = new doublyLinkedList();
        // dll.head = new Node(0);
        dll.insertNode(8);
        dll.insertNode(12);
        dll.insertNode(10);
        dll.insertNode(5);
        dll.insertNode(4);
        dll.insertNode(1);
        dll.insertNode(6);

        dll.display();
        dll.evenOdd(head);
        dll.display();
        
    }
}