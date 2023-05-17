class Node {
    Object data;
    Node next;
  
    Node(Object data) {
        this.data = data;
        this.next = null;
    }
}

public class OrderedLinkedList {
    Node head;
    Node tail;
  
    public void addNode(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
           // tail.next = newNode;
           // tail = newNode;
            newNode.next = head;
            head = newNode;
        }
    }
  
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
  
    public static void main(String[] args) {
        OrderedLinkedList list = new OrderedLinkedList();
        list.addNode("apple");
        list.addNode("banana");
        list.addNode("cherry");
        list.addNode("date");
        list.addNode("elderberry");
        System.out.println("List of elements: ");
        list.printList();
    }
}
