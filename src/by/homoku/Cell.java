package by.homoku;
//ячейка у которой есть координаты

public class Cell {
    private final int rowIndex;
    private final int colIndex;

    public Cell(int rowIndex, int colIndex){
        this.rowIndex=rowIndex;
        this.colIndex=colIndex;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public int getColIndex() {
        return colIndex;
    }

    @Override
    public String toString() {
        return rowIndex + ":" + colIndex;
    }
}
