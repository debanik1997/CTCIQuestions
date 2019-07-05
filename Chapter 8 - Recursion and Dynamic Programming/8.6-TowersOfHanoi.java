// 8.6) Towers of Hanoi

public void TowersOfHanoi(int N, Stack<Integer> source, Stack<Integer> dest, Stack<Integer> buffer) {
	if (N == 1) {
		int elem = source.pop();
		dest.push(elem);
		return;
	}

	TowersOfHanoi(N-1, source, buffer, dest);
	int elem = source.pop();
	dest.push(elem);
	TowersOfHanoi(N-1, buffer, dest, source);
}