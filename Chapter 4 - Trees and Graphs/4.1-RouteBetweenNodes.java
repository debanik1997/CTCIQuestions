// 4.1) Route Between Nodes

public boolean RouteBetweenNodes(Node root, Node end) {
	Queue q = new Queue();
	root.marked = true;
	q.enqueue(root);

	while (!q.isEmpty()) {
		Node n = q.dequeue();
		if (n.equals(end)) {
			return true;
		}
		foreach (Node v in n.neighbors) {
			if (v.marked == false) {
				v.marked = true;
				q.enqueue(v);
			}
		}
	}
	return false;
}

public void RouteBetweenNodes(Node root, Node end, boolean found) {
	if (root == null) {
		return;
	}
	if (root == end) {
		found = true;
	}

	root.visited = true;
	foreach (Node v in root.neighbors) {
		if (v.visited == false) {
			RouteBetweenNodes(v, end, found);
		}
	}
}