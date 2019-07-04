// 1.7) Rotate Matrix


// My Solution (Not complete - General Idea)
public void RotateMatrix(int[][] matrix) {
	int N = matrix.length;

	for (int i = 0; i < N / 2; i++) {

		for (int x = i; x < N - 1 - i; x++) {
			int temp = matrix[x][N-1-i];
			matrix[x][N-1-i] = matrix[i][x];
			int temp2 = matrix[N-1+i][N-1+x];
			matrix[N-1-i][N-1+x] = temp;
			int temp3 = matrix[N-1+x][N-1-i];
			// ....
		}
	}
}

// Book Solution
// TO SWAP 4 Arrays ->
					// for i = 0 to n:
						// temp = top[i];
						// top[i] = left[i];
						// left[i] = bottom[i];
						// bottom[i] = right[i];
						// right[i] = temp;

// For my solution, call i layer; determine first to last. Use offset (for left and bottom bc going "opposite" way)