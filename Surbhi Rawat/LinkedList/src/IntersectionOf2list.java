public class IntersectionOf2list {
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
        while (temp!=null ) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    static Node intersection(Node head1, Node head2){
        if(head1 ==null|| head2==null) return null;
        Node temp1=head1;
        Node temp2=head2;
        while(temp1!=temp2){
            temp1 = temp1.next;
            temp2=temp2.next;

            if(temp1==null){
                temp1=head2;
            }
            if(temp2==null){
                temp2=head1;
            }
        }
        return temp1;


    }

    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={2,4,5,6};
        Node head1=makeLL(arr1);
        Node head2=makeLL(arr2);
        Node intersectingPoint = intersection(head1,head2);
        if(intersectingPoint==null){
            System.out.println("Do not intesect");
        }
        System.out.println(intersectingPoint.data);
    }
}
