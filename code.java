public class LinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            }
            tail.next = newNode;
            tail = newNode;

        }

        void insertAtHead(int data){
            Node newNode = new Node(data);

            if(head == null) {
                insertAtEnd(data);
        }
            newNode.next = head;
            head = newNode;

    }

    void insertAt(int idx , int val){
        Node t = new Node(val);
        Node temp = head;
        if(idx == size()){
              insertAtEnd(val);  
              return;
        }
        else if(idx == 0){
            insertAtHead(val);
            return;
        }
        else if(idx < 0 || idx > size()){
            System.out.println("wrong index");
        }

        for(int i=1;i<=idx-1;i++){
            temp = temp.next;

        }
         t.next = temp.next;
         temp.next = t;

    }

         void deleteAt(int idx){
            if(idx == 0) head = head.next;
            Node temp = head;
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;

            }
            temp.next = temp.next.next;
            tail = temp;

    }

       int getAt(int idx){
        Node temp = head;
         if(idx < 0 || idx > size()){
            System.out.println("wrong index");
        }
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        return temp.data;


       }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }


        int size(){
            Node temp = head;
            int count = 0;
            while (temp != null) {
               count++;
                temp = temp.next;
            }
            return count;
        }

    }

    public static void main(String[] args) {

        linkedlist ll = new linkedlist();
        ll.insertAtEnd(12);
        ll.insertAtEnd(15);
        ll.insertAtEnd(23);
        ll.insertAtEnd(25);
        ll.insertAtEnd(28);

        ll.insertAtHead(90);
        ll.display();
        System.out.println();

        ll.insertAt(2, 55);
        ll.insertAt(7,98);
        ll.insertAt(0,100);

        

        ll.display();

        ll.deleteAt(4);
        ll.deleteAt(0);
        System.out.println();
        ll.display();
        System.out.println();

        System.out.println(ll.size());
        System.out.println(ll.getAt(3));
    }
}
