
import java.util.LinkedList;

public class NodeProgram {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
        Node() {}
    }

    static Node head;

    static void addToTheLast(Node listNode , Node node) {
        if (listNode == null ) {
            listNode = node;
        } else {
            Node temp = listNode;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 6, 7, 8, 9};
        Node listNode1 = new Node();
        Node listNode2 = new Node();
        for (int i = 0; i < arr1.length; i++) {
            addToTheLast(listNode1 , new Node(arr1[i]));
        }
        for (int i =0 ; i < arr2.length ; i++) {
            addToTheLast(listNode2,new Node(arr2[i]));
        }

        Node temp1 = listNode1;
        while (temp1 != null) {
            System.out.println(temp1.data);
            temp1 = temp1.next;
        }
        Node temp2 = listNode2;
        while (temp2 != null) {
            System.out.println((temp2.data));
            temp2 = temp2.next;
        }
    }
}


