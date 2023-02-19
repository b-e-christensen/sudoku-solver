public class IsValid {
  /*
  @param arr -- a 2d array that holds the value of each square in the sudoku grid
  @param row -- int value of the row that is being checked
  @param num -- the value of the number that is being checked in the row to see if it is valid
  */
    public static boolean isValidInRow(int[][] arr, int row, int num) {
      for(int i = 0; i < arr.length; i++) {
        if(arr[row][i] == num) {
          return false;
        }
      }
      return true;
    }
    /*
    @param arr -- same as in isValidInRow
    @param column -- int value of the column that is being checked.
    @param num -- same as in isValidInRow
     */
    public static boolean isValidInColumn(int[][] arr, int column, int num) {
      for(int i = 0; i < arr.length; i++) {
        if(arr[i][column] == num) {
          return false;
        }
      }
      return true;
    }

    public static boolean isValidInBox(int[][] arr, int row, int column, int num) {
      int rowStartIndex = row - (row % 3);
      int columnStartIndex = column - (column % 3);

      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          if (arr[rowStartIndex + i][columnStartIndex + j] == num) {
            return false;
          }
        }
      }
      return true;
    }
}
