// 8.5) Recursive Multiply

public int RecursiveMultiply(int a, int b) {
	int sum = 0;
	int[] memo = new int[a];
	return RecursiveMultiply(a, b, sum);
}

public int RecursiveMultiply(int a, int b) {
	if (a <= 1) {
		return b;
	}

	if (a % 2 == 1) {
		if (memo[a] == 0) {
			memo[a] = RecursiveMultiply(a/2, b) + RecursiveMultiply((a/2)+1, b);
		}
		return memo[a];
	} else {
		if (memo[a] == 0) {
			memo[a] = RecursiveMultiply(a/2, b) + RecursiveMultiply(a/2, b);
		}
		return memo[a];
	}

}