public class Node {
	Node next = null;
	int data;
	boolean marked;

	public Node(int d) {
		data = d;
		marked = false;
	}
}

public Node Intersection(Node n1, Node n2) {
	while (n1 != null && n2 != null) {
		if (!n1.marked && !n2.marked) {
			n1.marked = true;
			n1 = n1.next;
			n2.marked = true;
			n2 = n2.next;
		} else {
			if (n1.marked) {
				return n1;
			} else {
				return n2;
			}
		}
	}

	return null;
}