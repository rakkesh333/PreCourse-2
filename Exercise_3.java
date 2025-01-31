// Time Complexity : O(n)
// Space Complexity : O(n)
class LinkedList {
    Node head; 
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + "->");
            tnode = tnode.next;
        }
          System.out.println("NULL");
    }
     void printMiddle() {
       
        if (head != null) {
            Node fast = head, slow = head;
            while (fast != null) {
                if (fast.next == null) {
                    break;
                }
                
                slow = slow.next;
                fast = fast.next.next;
            }
            System.out.print("The middle element is ["
                    + slow.data + "]");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        for (int i = 15; i > 0; --i) {
            llist.push(i);
            llist.printList();
            llist.printMiddle();
        }
    }
}