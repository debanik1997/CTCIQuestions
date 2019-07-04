// 1.8) Zero Matrix

// My Solution
public void ZeroMatrix(int[][] matrix) {
	ArrayList<ArrayList<Integer>> coordinates = new ArrayList<ArrayList<Integer>>();

	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix[0].length; j++) {
			if (matrix[i][j] == 0) {
				// Store (i,j)
				ArrayList<Integer> coords = new ArrayList<Integer>(2);
				coords[0] = i;
				coords[1] = j;
				coordinates.append(coords);
			}
		}
	}

	foreach (ArrayList<Integer> coordinate in coordinates) {
		zeroOut(matrix, coordinate[0], coordinate[1]);
	}
}

public void zeroOut(int[][] matrix, int row, int column) {
	for (int i = 0; i < matrix.length; i++) {
		matrix[i][column] = 0;
	}
	for (int j = 0; j < matrix[0].length; j++) {
		matrix[row][j] = 0;
	}
}

// Book Solution
// My solution is O(N)
// This solution is O(1)
// Use matrix to store coordinates
// Determine if first row and column have 0s (if yes, will nullify later)
// Iterate through everything but first row and columin in matrix and set matrix[i][0] and matrix[0][j] to 0 when there's a 0 at matrix[i][j]
// Nullify row i if matrix[i][0] = 0, Nullify col j if matrix[0][j] = 0
// Nullify first row and col if necessary