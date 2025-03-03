public class palindrome {
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
    static Node makeLL(int[] arr){
        Node head = new Node(arr[0]);
        Node temp=head;
        for (int i = 1; i < arr.length; i++) {
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
    static Node reverse(Node head){
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            Node front = temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }

    static boolean palindrome(Node head){
        if(head==null || head.next==null){
            return true;
        }
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node newHead=reverse(slow);
        Node first=head;
        Node second=newHead;
        while(second.next!=null){
            if(first.data!=second.data){
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;

    }

    public static void main(String[] args) {
        int arr[]={12,4,6,6,4,12};
        Node head=makeLL(arr);
        System.out.println(palindrome(head));
    }
}
