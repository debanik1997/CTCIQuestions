// 1.1) Is Unique

// My Solution
public boolean IsUnique(String s) {
	int[] hash = new int[128];
	for (int i = 0; i < s.length(); i++) {
		if (hash[s.charAt(i)] > 0) {
			return false;
		}
		hash[s.charAt(i)]++;
	}
	return true
}

// Book Solution
// If you can't use data structure, sort and check adjacent.