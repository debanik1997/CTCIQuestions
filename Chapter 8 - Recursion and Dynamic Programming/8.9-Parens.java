// 8.9) Parens

public void Parens(int n) {
	Parens(n, new StringBuilder(), 0, 0);
}

public void Parens(int n, StringBuilder sb, int open, int closed) {
	if (sb.length() == n * 2 && open == closed) {
		System.out.println(sb.toString());
		return;
	}

	if (open < n) {
		Parens(n, sb.append("("), open+1, closed);
	}
	if (closed < open) {
		Parens(n, sb.append(")"), open, closed+1);
	}

}