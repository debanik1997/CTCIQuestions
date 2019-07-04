// 2.6) Palindrome (Left to do)

// Reverse LinkedList (Important)
// Iteratively (Stack)
// Recursive

// My Solution (Reverse LinkedList)
public boolean Palindrome(Node head) {
	Node reversed = Reverse(head);
	return isEqual(reversed, head);
}

public Node Reverse(Node n) {
	Node head = null;
	while (n != null) {
		Node m = new Node(n.data);
		m.next = head;
		head = m;
		n = n.next;
	}
	return head;
}

public boolean isEqual(Node n1, Node n2) {
	while (n1 != null || n2 != null) {
		if (n1.data != n2.data) {
			return false;
		}
		n1 = n1.next;
		n2 = n2.next;
	}
	if (n1 != null || n2 != null) {
		return false;
	}
	return true;
}

// Iterative (Runner w/ Stack)
public boolean Palindrome(Node head) {
	Node n1 = head;
	Node n2 = head;
	Stack<Integer> stack = new Stack<Integer>();
	while (n2.next != null || n2.next.next != null) {
		stack.push(n1.data);
		n1 = n1.next;
		n2 = n2.next.next;
	}

	n1 = n1.next;
	bool first = true;
	while (n1 != null) {
		if (n1.data == stack.peek()) {
			stack.pop();
		} else {
			return false;
		}
		n1 = n1.next;
	}
	return true;
}