// 3.1) Three in One

// Try maintaining "thirds" of array

class ThreeInOneStack {
	static final int MAX = 100;
	int top1;
	int top2;
	int top3;
	int[] a = new int[MAX];

	boolean isEmpty(int stackNum) {
		if (stackNum == 1) {
			return (top1 < 0);
		} else if (stackNum == 2) {
			return (top2 < 0);
		} else {
			return (top3 < 0);
		}
	}

	ThreeInOneStack() {
		top1 = -1;
		top2 = -1;
		top3 = -1;
	}

	int pop(int stackNum) {
		if (stackNum == 1) {
			if (top1 >= 0) {
				int x = a[--top1];
				return x;
			} else {
				throw new EmptyStackException();
			}
		} else if (stackNum == 2) {
			if (top2 >= 0) {
				int offset = top2 + top1;
				int x = a[--top2];
				return x;
			} else {
				throw new EmptyStackException();
			}
		} else {
			if (top3 >= 0) {
				int x = a[--top3];
				return x;
			} else {
				throw new EmptyStackException();
			}
		}
	}

	void push(int item, int stackNum) {
		if (stackNum == 1) {
			a[++top1] = x;
		} else if (stackNum == 2) {
			++top2;
			int offset = top2 + top1;
			a[top2] = x
		} else {
			++top3
		}
	}
}