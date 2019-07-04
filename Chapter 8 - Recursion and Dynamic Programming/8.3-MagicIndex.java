// 8.3) Magic Index

// When all elements are distinct
public int MagicIndex(int[] A) {
	return MagicIndex(0, A.length-1, A);
}

public int MagicIndex(int low, int high, int[] A) {
	if (high < low) {
		return -1;
	}
	int mid = (low + high) /2;
	if A[mid] = mid {
		return mid;
	} else {			
		if (A[mid] > mid) {
			high = mid-1;
		} else {
			low = mid+1;
		}
		return MagicIndex(low, high, A);
	}
}

// When elements are not distinct
public int MagicIndex(int[] A) {
	return MagicIndex(0, A.length-1, A);
}

public int MagicIndex(int low, int high, int[] A) {
	if (high < low) {
		return -1;
	}
	int mid = (low + high) /2;
	if (A[mid] = mid) {
		return mid;
	}

	int midVal = A[mid];
	//search left
	int left = MagicIndex(low, Math.min(midVal, mid-1), A);
	if (left >= 0) {
		return left;
	}
	// search right
	int right = MagicIndex(Math.max(midVal, mid+1), high, A);
	return right;
}
