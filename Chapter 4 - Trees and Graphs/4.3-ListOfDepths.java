// 4.3) List of Depths

public LinkedList<LinkedList<Node>> ListOfDepths(Node root) {
	LinkedList<LinkedList<Node>> result = new LinkedList<LinkageError<Node>>();
	LinkedList<Node> curr = new LinkedList<Node>();
	if (root != null) {
		curr.append(root);
	}
	while (current.size() > 0) {
		result.append(current);
		LinkedList<Node> parents = current;
		current = new LinkedList<Node>();

		foreach (Node parent : parents) {
			if (parent.left != null) {
				current.append(parent.left);
			}
			if (parent.right != null) {
				current.append(parent.right);
			}
		}
	}
	return result;
}

////////////////////////////////////////////////////////////////

public LinkedList<LinkedList<Node>> ListOfDepths(Node node, LinkedList<LinkedList<Node>> result, int level) {
	if (node == null) { return; }

	LinkedList<Node> current = null;
	if (lists.size() == level) {
		current = new LinkedList<Node>();
		result.append(current);
	} else {
		current = result.get(level);
	}
	current.append(node);
	ListOfDepths(node.right, curr, result, level+1);
	ListOfDepths(node.left, curr, result, level+1);

}


public LinkedList<LinkedList<Node>> ListOfDepths(Node root) {
	LinkedList<Node> curr = new LinkedList<Integer>();
	LinkedList<LinkedList<Node>> result = new LinkedList<LinkedList<Node>>();
	ListOfDepths(root, result, 0);
	return result;
}