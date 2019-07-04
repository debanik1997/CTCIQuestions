// 8.2) Robot in a Grid

// My Solution (More of a generate all possible paths)
public ArrayList<ArrayList<Integer>> RobotInAGrid(int[][] grid) {
	ArrayList<Integer> currentPos = new ArrayList<Integer>();
	currentPos.add(0);
	currentPos.add(0);
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	result.add(currentPos);

	return result;
}

public ArrayList<ArrayList<Integer>> RobotInAGrid(int[][] grid, ArrayList<Integer> currentPos, ArrayList<ArrayList<Integer>> result) {
	int row = currentPos[0];
	int col = currentPos[1]
	if (row == grid.length - 1 && col == grid[0].length - 1) {
		return;
	}

	if (row < grid.length && grid[row+1][col] != 0) {
		ArrayList<Integer> newPos = new ArrayList<Integer>();
		newPos[0] = row+1;
		newPos[1] = col;
		result.add(newPos);
		RobotInAGrid(grid, newPos, result);
		result.remove(newPos);
	}

		if (col < grid[0].length && grid[row][col+1] != 0) {
		ArrayList<Integer> newPos = new ArrayList<Integer>();
		newPos[0] = row;
		newPos[1] = col+1;
		result.add(newPos);
		RobotInAGrid(grid, newPos, result);
		result.remove(newPos);
	}
}

// Book Solution (The answer was asking for any path)
public ArrayList<ArrayList<Integer>> RobotInAGrid(int[][] grid) {
	int row = 0;
	int col = 0;

	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

	if (isPath(row, col, grid, path)) {
		return path;
	}
}

public boolean isPath(int currentRow, int currentCol, int[][] maze, ArrayList<ArrayList<Integer>> path, HashSet<Point> failedPoints) {
	if (currentRow >= maze.length || currentCol >= maze[0].length || maze[currentRow][currentCol] < 0) {
		return false;
	}

	if (failedPoints.contains((currentRow, currentCol))) {
		return false;
	}

	if ((currentRow == maze.length-1 && currentCol == maze[0].length-1) || isPath(currentRow++, currentCol, maze) || isPath(currentRow, currentCol++, maze)) {
		ArrayList newPoint = new ArrayList<INteger>();
		newPoint.add(currentRow);
		newPoint.add(currentCol);
		path.add(newPoint);
		return true;
	}

	failedPoints.add((currentRow, currentCol));
	return false;
}
