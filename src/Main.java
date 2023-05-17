import java.util.LinkedList;
import java.util.Arrays;

public class Main {
  static class Node {
    int data;
    Node next;
    
    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }
  
  static LinkedList<Node> linkedList = new LinkedList<>();
  
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    Node resultNode = new Node(0);

    Arrays.stream(arr)
      .mapToObj(Node::new)
      .forEach(node -> linkedList.add(node));
    
    linkedList.forEach(node -> System.out.println(node.data));
  }
}
