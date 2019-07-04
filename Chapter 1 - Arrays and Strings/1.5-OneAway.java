// 1.5) One Away

// My Solution
public boolean OneAway(String s1, String s2) {
	int edits = 0;
	edits += Math.abs(s1.length() - s2.length());

	boolean one = false;
	boolean two = false;

	String shorter = null;
	String longer = null;
	boolean differByOne = true;
	if (s1.length() < s2.length()) {
		shorter = s1;
		longer = s2;
	} else if (s2.length() < s1.length(){
		shorter = s2;
		longer = s1;
	} else {
		differByOne = false;
		shorter = s1;
		longer = s2;
	}

	int j = 0;
	for (int i = 0; i < shorter.length(); i++) {
		if (edit > 1) {
			return false;
		} else {
			if (shorter.charAt(i) != longer.charAt(j)) {
				edit++;
				if (differByOne) {
					i--;
					edit--;
					differByOne = false;
				}
			}
		} 
		j++;
	}
	return true;
}

// Book Solution