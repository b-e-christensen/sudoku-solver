public class Row {
    private Square[] rowArr;
    private boolean isSolved;

    public Row() {
        this(new Square[9]);
    }
    public Row (Square[] rowArr) {
        this.rowArr = rowArr;
    }
}
