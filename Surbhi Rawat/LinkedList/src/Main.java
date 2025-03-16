public class Main {
    public static void main(String[] args) {
        int arr[]={2,5,7,9,10};
        Node y = new Node(arr[3]);
        System.out.println(y.data);
    }
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
}