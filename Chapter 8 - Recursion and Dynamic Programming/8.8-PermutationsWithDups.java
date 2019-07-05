// 8.8) Permutation with Dups

// Should be optimized: case 'aaaaaaaaaa'

public ArrayList<String> PermutationWithDups(String s) {
	HashSet<String> result = new HashSet<String>();
	StringBuilder sb = new StringBuilder();
	HashSet<Character> cur = new HashSet<Character>();
	PermutationWithoutDups(s, sb, result);
	return new ArrayList<String>(result);
}

public void PermutationWithoutDups(String s, StringBuilder sb, ArrayList<String> result, HashSet<Character> cur) {
	if (sb.length() == s.length()) {
		result.add(sb.toString());
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