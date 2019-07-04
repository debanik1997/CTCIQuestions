// 1.2) Check Permutation

// My Solution
public boolean CheckPermutation(String s1, String s2) {
	if (s1.length() != s2.length()) {
		return false;
	}

	int[] checker = new int[128];
	for (int i = 0; i < s1.length(); i++) {
		char c = s1.charAt(i);
		checker[c]++;
	}
	for (int i = 0; i < s2.length(); i++) {
		char c = s2.charAt(i);
		checker[c]--;
		if (checker[c] == -1) { 
			return false;
		}
	}
	return true
}