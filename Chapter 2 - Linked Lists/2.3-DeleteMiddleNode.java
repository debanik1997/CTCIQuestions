//2.3) Delete Middle Node

// My Solution (Not good)
public void DeleteMiddleNode(Node n) {

	while (n.next != null) {
		n.data = n.next.data;
		n = n.next;
	}
	n = null;
}

// Book (better) Solution
// Only deleting copying data from next node, and then adjusting pointer to skip over next node.
public void DeleteMiddleNode(Node n) {
	if (n == null || n.next == null) {
		return;
	}
	n.data = n.next.data;
	n.next = n.next.next;
	return;
}


