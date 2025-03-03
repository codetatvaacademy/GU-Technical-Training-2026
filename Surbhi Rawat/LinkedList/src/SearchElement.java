public class SearchElement {
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
        Node head=new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp=new Node(arr[i],null);
            mover.next=temp;
            mover = temp;
        }
        return head;
    }
    static boolean searchEl(Node head, int value){
        Node temp = head;
        while(temp!= null){
            if(temp.data==value){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={23,45,6,7,8,9};
        int value=98;
        Node head = ll(arr);
        System.out.println(searchEl(head,value));
    }
}
