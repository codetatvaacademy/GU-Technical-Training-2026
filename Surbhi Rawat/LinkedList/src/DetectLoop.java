public class DetectLoop {
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

    static boolean loop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
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
        fourth.next = third;
        // Create a loop
        fifth.next = third;
        if (loop(head) == true) {
            System.out.println("Loop present");
        }else{
            System.out.println("loop not present");
        }


    }
}

