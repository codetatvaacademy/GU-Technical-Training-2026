public class removeNthNodeFromEnd {
    static class Node{
        int data;
        Node next;
        Node(int data1, Node next1){
            this.data = data1;
            this.next= next1;
        }
        Node(int data1){
            this.data = data1;
        }
    }
    static Node removeNode(Node head, int n){
        Node fast=head;
        Node slow=head;
        for (int i = 0; i < n; i++) {
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    static Node makeLL(int[] arr){
        Node head = new Node(arr[0]);
        Node temp=head;
        for (int i = 0; i < arr.length; i++) {
            temp.next= new Node(arr[i]);
            temp=temp.next;
        }
        return head;

    }
    static void printLL(Node head){
        Node temp=head;
        while (temp!=null && temp.next!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7,8,9};
        int n = 4;
        Node head = makeLL(arr);
        Node newHead=removeNode(head,n);
        printLL(newHead);
    }

}
