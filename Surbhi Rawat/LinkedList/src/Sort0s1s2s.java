public class Sort0s1s2s {
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
    static Node sort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node temp = head;
        Node oneHead=new Node(-1);
        Node zeroHead=new Node(-1);
        Node twoHead=new Node(-1);
        Node one = oneHead;
        Node zero=zeroHead;
        Node two=twoHead;
        while(temp != null){
            if(temp.data==1){
                one.next=temp;
                one=temp;

            }else if(temp.data==0){
                zero.next=temp;
                zero=temp;
            }else{
                two.next=temp;
                two=temp;
            }
            temp=temp.next;
        }
        if(oneHead!=null){
            zero.next=oneHead.next;
        }else{
            zero.next=twoHead.next;
        }
        if(twoHead!=null){
            one.next=twoHead.next;
        }else{
            one.next=null;
        }
        two.next=null;
        Node newHead = zeroHead.next;
        return newHead;
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


    public static void main(String[] args) {
        int arr[]={1,0,2,1,2,0,0,1};
        Node head=makeLL(arr);
        Node newLL = sort(head);
        printLL(newLL);

    }
}
