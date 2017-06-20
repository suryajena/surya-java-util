package org.surya.java.util.datastructures;

public class LinkedList1 {
	class Node {
		Node next;
		int data;

		public Node() {
		}

		public Node(int data) {
			this.data = data;
		}

	}

	static Node insert(Node head, int data) {

		if (null == head) {
			head = new LinkedList1().new Node();
			head.data = data;
			return head;
		}

		head.next = insert(head.next, data);
		return head;

	}

	Node InsertNth(Node head, int data, int position) {

		if (position == 0) {

			Node a = new Node();
			a.data = data;
			a.next = head;
			return a;

		}

		Node b = InsertNth(head.next, data, position - 1);
		head.next = b;
		return head;

	}

	private Node InsertAtHead(Node head, int x) {

		Node a = new Node();
		a.data = x;
		a.next = head;
		return a;

	}

	private static void print(Node node) {
		if (node == null)
			return;

		System.out.println(node.data);
		print(node.next);
	}

	public static void main(String[] args) {
		LinkedList1 l = new LinkedList1();
		Node head = l.new Node();

		Node a = insert(null, 2);
		Node b = insert(a, 3);
		Node c = insert(b, 4);
		print(b);

	}
}
