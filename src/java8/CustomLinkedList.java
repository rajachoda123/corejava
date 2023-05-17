package java8;

public class CustomLinkedList {
	// head of the list
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int dt) {
			data = dt;
			next = null;
		}
	}

	public static void insert(CustomLinkedList customList, int data) {
		Node newNode = new Node(data);
		if (customList.head == null) {
			customList.head = newNode;
		} else {
			Node last = customList.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomLinkedList cll = new CustomLinkedList();
		insert(cll, 1);
		insert(cll, 2);
		insert(cll, 3);
		String str = "sai baba";
		String[] str1 = {"sai","baba","kafka"}; 
		
		char[] array = str.toCharArray();
		for (char c : array) {
			
		}

		//cll.printList(cll);
	}

	public void printList(CustomLinkedList cll) {
		Node node = cll.head;
		while (node != null) {
			System.out.println("value is " + node.data);
			node = node.next;
		}
	}
	
	/*
	 * public String[] permutation() { return }
	 */

}
