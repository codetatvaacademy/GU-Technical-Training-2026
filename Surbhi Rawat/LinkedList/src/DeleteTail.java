public class DeleteTail {
    // DEFINING THE STRUCTURE OF LL
    static class Node{
        int data;
        Node next;
        Node(int data1, Node next1){
            this.data=data1;
            this.next=next1;
        }
        Node(int data1){
            this.data=data1;
            this.next=null;
        }
    }

    // MAKING LL FROM GIVEN DATA
    static Node ll(int arr[]){
        Node head = new Node(arr[0]);
        Node mover=head;
        for (int i = 0; i < arr.length; i++) {
            Node temp=new Node(arr[i],null);
            mover.next=temp;
            mover = temp;
        }
        return head;
    }
     // DELETING THE TAIL

    static Node delTail(Node head){
        Node temp = head;
        while(temp.next.next!= null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    static void printLL(Node newHead){
        Node temp=newHead;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        int arr[]={12,34,56,7,9,10};
        Node head = ll(arr);
        Node newHead = delTail(head);
        printLL(newHead);
    }
}
