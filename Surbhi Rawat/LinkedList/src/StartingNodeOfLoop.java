public class StartingNodeOfLoop {
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
    static Node start(Node head){
        Node slow= head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(fast!=slow){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;

        Node loopStart=start(head);
        if(loopStart!=null){
            System.out.println(loopStart.data);
        }else{
            System.out.println("Not found");
        }

    }
}
