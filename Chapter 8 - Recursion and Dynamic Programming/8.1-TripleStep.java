// 8.1) Triple Step

// My solution
public int TripleStep(int n) {
	int[] memo = new int[n];
	memo[1] = 1;
	memo[2] = memo[1] + 1;
	memo[3] = memo[2] + memo[1] + 1;
	return TripleStep(n, memo);
}

public int TripleStep(int n, int[] memo) {
	if (n <= 0) {
		return 0;
	}
	if (memo[n] == 0) {
		memo[n] = TripleStep(n-1, memo) + TripleStep(n-2, memo) + TripleStep(n-3, memo);
	}
	return memo[n];
}

// Book solution
// Don't fill 1, 2, 3 manually -> if (n == 0) {return 1}, if (n < 0) { return 0}