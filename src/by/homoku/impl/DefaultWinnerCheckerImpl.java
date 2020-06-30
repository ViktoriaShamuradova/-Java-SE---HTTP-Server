package by.homoku.impl;

import by.homoku.*;

import java.util.Objects;

//класс, который проверяет победителя
public class DefaultWinnerCheckerImpl implements WinnerChecker {
    private GameTable gameTable;
    private int winCount = DefaultConstants.WIN_COUNT;

    @Override
    public void setGameTable(GameTable gameTable) {
        Objects.requireNonNull(gameTable, "Gametable can't be null");
        if(gameTable.getSize()<winCount) {
            throw  new IllegalArgumentException("Size of gametable is small: "+ gameTable.getSize()+"Required >= "+ winCount);
        }
        this.gameTable = gameTable;
    }

    @Override
    public WinnerResult isWinnerFound(CellValue cellValue) {
        return null;
    }
}
