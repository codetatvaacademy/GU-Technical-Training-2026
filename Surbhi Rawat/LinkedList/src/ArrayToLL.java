public class ArrayToLL {
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
        Node head= new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i],null);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    static void printLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,11};
        Node head= makeLL(arr);
        printLL(head);
    }
}
