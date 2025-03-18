
public class cycleLL {
        class Node {
            int data;
            Node next;
    
            public Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        public boolean hasCycle(Node head) {
            Node fast = head;
            Node slow = head;
    
            while(fast!=null&&fast.next!=null){
    
                fast = fast.next.next;  
                slow = slow.next;
                       
                if(fast==slow){       
                    return true;
                }
            }
          return false;
        }
}
