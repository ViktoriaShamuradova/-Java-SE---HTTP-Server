package by.homoku;

//ход пользователя
public interface HumanTurn {
//устанавливается то игровое поле, на котором будет выполняться ход человека
    void setGameTable(GameTable gameTable);

    //делает ход, принимая координаты и возвращает ячейку , куда записан
    Cell makeTurn(int row, int col);

}
