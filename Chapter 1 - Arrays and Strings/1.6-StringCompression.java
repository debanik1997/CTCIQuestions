// 1.6) String Compression

// My Solution
public String StringCompression(String s) {
	int i = 0;
	int j = 0;

	StringBuilder sb = new StringBuilder();
	int count = 0;
	while (j < s.length()) {
		if (s.charAt(i) == s.charAt(j)) {
			count++;
			j++;
		} else {
			sb.append(s.charAt(i));
			sb.append((Character)count);
			i = j;
			count = 0;
		}
	}
	sb.append(s.charAt(i));
	sb.append(Character(count));

	if (sb.length() >= s.length()) {
		return s;
	} else {
		return sb.toString();
	}
}

// Book Solution
// Check to see if compression is even necessary in the first place.
// Initialize length of SB right away