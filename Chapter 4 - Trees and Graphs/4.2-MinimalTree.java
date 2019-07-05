// 4.2) Minimal Tree

class Node {
	int data;
	Node right;
	Node left;
}

class Tree {
	Node root;
}

public Node MinimalTree(int[] array) {
	return MinimalTree(array, 0, array.length - 1);
}

public Node MinimalTree(int[] array, int left, int right) {
	if (left < right) { // careful with <= vs <
		return null;
	}
	int mid = (left + right) / 2;
	Node root = new Node(mid);
	root.left = MinimalTree(array, left, mid-1);
	root.right = MinimalTree(array, mid+1, right);
}