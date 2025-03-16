public class LengthOfLLByTransversal {
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
    static Node makeLL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp= new Node(arr[i],null);
            mover.next = temp;
            mover=temp;
        }
        return head;
    }
    static int length(Node head){
        int len=0;
        Node temp=head;
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        return len;
    }

    public static void main(String[] args) {
        int arr[]={4,3,5,6,7,8};
        Node head = makeLL(arr);
        System.out.println(length(head));
    }
}
