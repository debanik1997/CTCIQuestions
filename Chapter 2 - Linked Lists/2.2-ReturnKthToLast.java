// 2.2) Return Kth to Last

// My Solution (Trivial)
public Node ReturnKthToLast(Node head, int k) {
	int i = 0;
	Node n = head;
	while (n.next != null) {
		i++;
		n = n.next;
	}

	int j = 0;
	Node m = head;
	while (j <= i-k) {
		j++;
		m = m.next;
	}
	return m;
}

// Book Solution

// Recursive (print out KthToLast)
// Algorithm recurses through linkedlist
// When it hits end, starts a counter from 0
// when counter == k, prints out correct element
public int ReturnKthToLast(Node head, int k) {
	if (head == null) {
		return 0;
	}

	int index = ReturnKthToLast(head.next, k) + 1;
	if (index == k) {
		System.out.println(head.data);
	}
	return index;
}

// Iterative
public Node ReturnKthToLast(Node head, int k) {
	Node p1 = head; 
	Node p2 = head;

	if (p1 == null) {
		return null;
	}

	for (int i = 0; i < k; i++) {
		p1 = p1.next;
	}

	while (p1.next != null) {
		p1 = p1.next;
		p2 = p2.next;
	}
	return p2;
}