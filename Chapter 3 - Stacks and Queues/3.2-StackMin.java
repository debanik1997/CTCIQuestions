// 3.2) Stack Min

class StackMin {
	static class StackNode<T> {
		T data;
		StackNode<T> next;

		StackNode(T data) {
			this.data = data
		}
	}

	StackNode<T> top;
	StackNode<T> min;

	T min() {
		if (!this.empty()) {
			return min.data;
		}
	}

	void push(T item) {
		StackNde<T> x = new StackNode<T>(item);
		if (x.data < min.data) {
			StackNode<T> oldMin = new StackNode<T>(min.data);
			oldMin.next = top;
			top = oldMin;
			min = x;
		}
		x.next = top;
		top = x;
	}

	T pop() {
		if (top.data == min.data) {
			top = top.next;
			min = top;
		}
		T data = top.data;
		top = top.next;
		return data;
	}

}