public class DeletingHead {
    static class Node{
        int data;
        Node next;
        Node(int data1, Node next1){
            this.data = data1;
            this.next= next1;
        }
        Node(int data1){
            this.data = data1;
            this.next=null;
        }
    }
    static Node ll(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i],null);
            mover.next=temp;
            mover = temp;
        }
        return head;
    }
    //DELETING ELEMENT FROM HEAD

    static Node removeHead(Node head){
        if(head==null){
            return head;
        }
        head = head.next;
        return head;
    }
    static void pritnLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " - ");
            temp=temp.next;
        }

    }


    public static void main(String[] args) {
        int arr[]={2,4,56,78,1};
        Node head=ll(arr);
        Node newHead= removeHead(head);


        pritnLL(newHead);
    }

}
