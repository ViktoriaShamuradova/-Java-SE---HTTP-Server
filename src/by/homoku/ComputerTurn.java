package by.homoku;

//ход компьютера
public interface ComputerTurn {

    //устанавливает игровую таблицу, для того чтобы объект
    //хода компьютера мог использовать эту игровую таблицу для взаимдейтсвия
    void setGameTable(GameTable gameTable);

    //выполняет ход и возваращает объект ячейки, куда записан 0
    Cell makeTurn();

    //первый ход компьютера, когда начинает компьютер
    Cell makeFirstTurn();
}
