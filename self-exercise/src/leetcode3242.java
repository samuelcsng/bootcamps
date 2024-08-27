class NeighborSum {
  private int[][] grid;

  public NeighborSum(int[][] grid) {
    this.grid = grid;
  }

  public int adjacentSum(int value) {
    // find row, col of value
    int elementRow = 0;
    int elementCol = 0;
    for (int row = 0; row < this.grid.length; row++) {
      for (int col = 0; col < this.grid[row].length; col++) {
        if (this.grid[row][col] == value) {
          elementRow = row;
          elementCol = col;
          break;
        }
      }
    }

    // create auxillary grid
    int[][] auxGrid = new int[this.grid.length][this.grid[0].length];
    // int[][] auxGrid = int[3][3];
    for (int row = 0; row < auxGrid.length; row++) {
      for (int col = 0; col < auxGrid[row].length; col++) {
        if (row == elementRow - 1 && col == elementCol) {
          auxGrid[row][col] = 1;
        }
        if (row == elementRow && col == elementCol - 1) {
          auxGrid[row][col] = 1;
        }
        if (row == elementRow && col == elementCol + 1) {
          auxGrid[row][col] = 1;
        }
        if (row == elementRow + 1 && col == elementCol) {
          auxGrid[row][col] = 1;
        }
      }
    }

    // calculate result
    int result = 0;
    for (int row = 0; row < grid.length; row++) {
      for (int col = 0; col < grid[row].length; col++) {
        result += grid[row][col] * auxGrid[row][col];
      }
    }
    return result;

  }

  public int diagonalSum(int value) {
    // find row, col of value
    int elementRow = 0;
    int elementCol = 0;
    for (int row = 0; row < this.grid.length; row++) {
      for (int col = 0; col < this.grid[row].length; col++) {
        if (grid[row][col] == value) {
          elementRow = row;
          elementCol = col;
          break;
        }
      }
    }

    // create auxillary grid
    int[][] auxGrid = new int[this.grid.length][this.grid[0].length];
    for (int row = 0; row < auxGrid.length; row++) {
      for (int col = 0; col < auxGrid[row].length; col++) {
        if (row == elementRow - 1 && col == elementCol - 1) {
          auxGrid[row][col] = 1;
        }
        if (row == elementRow - 1 && col == elementCol + 1) {
          auxGrid[row][col] = 1;
        }
        if (row == elementRow + 1 && col == elementCol - 1) {
          auxGrid[row][col] = 1;
        }
        if (row == elementRow + 1 && col == elementCol + 1) {
          auxGrid[row][col] = 1;
        }
      }
    }

    // calculate result
    int result = 0;
    for (int row = 0; row < grid.length; row++) {
      for (int col = 0; col < grid[row].length; col++) {
        result += grid[row][col] * auxGrid[row][col];
      }
    }
    return result;
  }
}

/**
 * Your NeighborSum object will be instantiated and called as such: NeighborSum obj = new NeighborSum(grid); int param_1 = obj.adjacentSum(value); int param_2 = obj.diagonalSum(value);
 */
