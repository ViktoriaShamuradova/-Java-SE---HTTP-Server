package by.homoku;

import by.введениеВ_ООП.коллекции.DataSet;

public interface WinnerResult {
    //возвращает true, если побдитель есть
    boolean winnerExists();

    //после того, как проверили победитель сущ или нет
    //мы можем плучить наше множдкство ячеек для того чтобы, выделить ячейки красным цветом и т.д.
    DataSet<Cell> getWinnerCell();
}
