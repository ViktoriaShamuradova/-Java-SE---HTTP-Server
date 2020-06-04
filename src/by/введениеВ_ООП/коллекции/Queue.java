package by.введениеВ_ООП.коллекции;

import by.введениеВ_ООП.коллекции.linkedList.LinkedList;

public class Queue<T> extends DataStructure<T> {

    public Queue() {
        super(new LinkedList<T>());
    }

    public Queue(LinkedList<T> dataSet) {
        super(dataSet);
    }

    @Override
    protected int getCurrentIndex() {
        return 0;
    }
}