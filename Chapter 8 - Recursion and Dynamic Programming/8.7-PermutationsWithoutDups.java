// 8.7) Permutation without Dups

public ArrayList<String> PermutationWithoutDups(String s) {
	ArrayList<String> result = new ArrayList<String>();
	StringBuilder sb = new StringBuilder();
	HashSet<Character> cur = new HashSet<Character>();
	PermutationWithoutDups(s, sb, result);
	return result;
}

public void PermutationWithoutDups(String s, StringBuilder sb, ArrayList<String> result, HashSet<Character> cur) {
	if (sb.length() == s.length()) {
		result.append(sb.toString());
		return;
	}

	for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		if (!cur.contains(c)) {
			cur.add(c);
			sb.append(c);
			PermutationWithoutDups(s, sb, result);
			cur.remove(c);
			sb.remove(c);
		}
	}
}