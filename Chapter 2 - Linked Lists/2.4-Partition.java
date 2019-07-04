// 2.4) Partition

// My Solution (kinda)
public Node Partition(Node head, int p) {
	Node n = head;
	Node tail = n;

	while (n != null) {
		if (n.data < p) {
			n.next = head;
			head = n;
		} else {
			tail.next = n;
			tail = n;
		}
		n = n.next;
	}
	tail.next = null;
	return head;
}

// Book Solution
// Since sort does not need to be stable, we can insert at "front" and "back" as we please
// Maintain a head/tail to keep track of where "correct" list is