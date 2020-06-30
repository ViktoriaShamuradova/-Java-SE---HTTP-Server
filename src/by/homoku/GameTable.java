package by.homoku;

public interface GameTable {
//получаем значение по указанным координатам
    CellValue getValue(int row, int col);
//устанавливаем значение
    void setValue(int row, int col, CellValue cellValue);
//переинициализируем, то есть сбросить и повторить игру заново
    void reInit();
//размер
    int getSize();
//пустая ли клетка
    boolean isCellFree(int row, int col);
//существуют ли вообще пустые ячейки на данном игровом поле
    boolean emptyCellExist();
}
