public class LengthOfLoop {
    static class Node {
        int data;
        Node next;

        Node(int data1, Node next1) {
            this.data = data1;
            this.next = next1;
        }

        Node(int data2) {
            this.data = data2;
            this.next = null;
        }
    }

    static Node makell(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }
    static int detectLoop(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return len(slow,fast);
            }
        }
        return 0;
    }
    static int len(Node slow,Node fast){
        int count =1;
        fast=fast.next;
        while(slow!=fast){
            count++;
            fast=fast.next;
        }
        return count;
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
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;
        System.out.println(detectLoop(head));
    }
}
