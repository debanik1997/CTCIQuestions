public class Node {
	Node next = null;
	int data;
	boolean marked;

	public Node(int d) {
		data = d;
		marked = false;
	}
}

public Node LoopDetection(Node n) {
	while (n != null) {
		if (!n.marked) {
			n.marked = true;
			n = n.next;
		} else {
			return n;
		}
	}
	return null;
}