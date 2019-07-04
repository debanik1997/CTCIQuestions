// 1.4) Palindrome Permutation

// My Solution
public boolean PalindromePermutation(String str) {
	char[] hash = new char[128];

	for (int i = 0; i < str.length(); i++) {
		hash[str.charAt(i)]++;
	}

	boolean odd = false;
	for (int i = 0; i < str.length(); i++) {
		if (hash[str.charAt(i)] % 2 != 0) {
			if (odd == false) {
				odd = true;
				continue;
			} else {
				return false;
			}
		}
	}
	return true;
}

// Book Solution
// Use single integer as bit-vector. When we see a letter, toggle bit at that value (on/off or 1/0).
// Check if final bit vector is either 0 or only has one toggled bit
// return bit_vector == 0 || (bit_vector & (bit_vector-1) == 0)
// 0100 & (0100-1) = (0100 & 0011) == 0 (no overlap of set bits)	