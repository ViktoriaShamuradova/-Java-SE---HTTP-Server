package by.homoku.impl;

import by.homoku.Cell;
import by.homoku.CellValue;
import by.homoku.GameTable;
import by.homoku.HumanTurn;

import java.util.Objects;

public class DefailtHumanTurnImpl implements HumanTurn {
    private GameTable gameTable;
    @Override
    public void setGameTable(GameTable gameTable) {
        //проверяем, чтобы gameTable не был null
        Objects.requireNonNull(gameTable, "GameTable can't be null");
        this.gameTable=gameTable;
    }
//как ходит человек
    @Override
    public Cell makeTurn(int row, int col) {
        gameTable.setValue(row, col, CellValue.HUMAN);
        return new Cell(row, col);
    }
}
