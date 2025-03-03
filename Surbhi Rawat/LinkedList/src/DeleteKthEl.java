public class DeleteKthEl {
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
    // DELETE Kth ELEMENT


}
