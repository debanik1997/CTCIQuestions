// 1.9) String Rotation

// My Solution
public boolean StringRotation(String s1, String s2) {
	int length = s1.length();

	for (int i = 0; i < length; i++) {
		String rotatedString = s1.substring(i, length) + s1.substring(0, i);
		if (rotatedString.Equals(s2)) {
			return true;
		}
	}
	return false;
}

// Book Solution
// Recognize that in rotated case, s1 = xy and s2 = yx;
// Also, check lengths same
// s1s1 = s1 + s1 = xyxy. If s2.IsSubstring(s1s1) => return true;
// This way is much better