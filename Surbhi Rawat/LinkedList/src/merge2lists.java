public class merge2lists {
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
    static Node merge(Node head1, Node head2){
        Node t1=head1;
        Node t2=head2;
        Node delNode=new Node(-1);
        Node temp=delNode;
        while(t1!=null && t2!=null ){
            if(t1 != null && t2!=null){
                if(t1.data < t2.data){
                    temp.next=t1;
                    temp=temp.next;
                }else{
                    temp.next=t2;
                    
                }
            }

        }
    }
}
