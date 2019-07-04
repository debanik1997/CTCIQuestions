// 2.1) Remove Dups

// My Solution (with extra space)
public Node RemoveDups(Node head) {
	HashSet<Integer> set = new HashSet<Integer>();
	Node n = head;
	set.add(n.data);

	while (n.next != null) {
		if (!(set.contains(n.next.data))) {
			set.add(n.next.data);
		} else {
			n.next = n.next.next;
		}
		n = n.next;
	}

	return head;
}

// My Solution (with no extra space)
public Node RemoveDups(Node head) {
	Node n = head;

	while (n.next != null) {
		Node m = n;
		while (m.next != null) {
			if (m.next.data == n.data) {
				m.next = m.next.next;
			} else {
				m = m.next;
			}
		}
		n = n.next;
	}
	return head;
}

// Book Solution
// Just be mindful of when iteration is necessary