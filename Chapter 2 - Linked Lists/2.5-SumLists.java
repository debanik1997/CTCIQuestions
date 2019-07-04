// 2.5) Sum Lists (Left to do)

// My Solution (reverse order)
public Node SumLists(Node n1, Node n2) {
	int carry = 0;
	Node curr;
	Node head;
	while (n1 != null && n2 != null) {
		if (head == null) {
			head = new Node((n1.data + n2.data + carry) % 10);
			carry = (n1.data + n2.data + carry) / 10;
			head.next = null;
			Node curr = head;
		} else { 
			Node n = new Node((n1.data + n2.data + carry) % 10);
			carry = (n1.data + n2.data + carry) / 10;
			curr.next = n;
			n.next = null;
		}
		n1 = n1.next;
		n2 = n2.next;
	}

	while (n1 != null) {
		Node n = new Node((n1.data + carry) % 10);
			carry = (n1.data + carry) / 10;
			curr.next = n;
			n.next = null;
	}

	while (n2 != null) {
		Node n = new Node((n2.data + carry) % 10);
			carry = (n2.data + carry) / 10;
			curr.next = n;
			n.next = null;
	}
	return head;
}