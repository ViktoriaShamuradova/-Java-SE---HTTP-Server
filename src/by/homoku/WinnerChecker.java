package by.homoku;

//проверяющий победителя
public interface WinnerChecker {
//устанавливается  игровое поле
    void setGameTable(GameTable gameTable);

 //принимает в качестве аргумента значение ячейки (х, 0)
 //и возвращает объект WinnerResult
    WinnerResult isWinnerFound(CellValue cellValue);
}
