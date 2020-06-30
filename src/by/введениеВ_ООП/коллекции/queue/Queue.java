package by.введениеВ_ООП.коллекции.queue;

import by.введениеВ_ООП.коллекции.DataStructure;
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

    @Override
    protected RuntimeException createEmptyExceptionInstance() {
        throw new QueueIsEmptyException();
    }

    public static class QueueIsEmptyException extends RuntimeException {
        private static final long serialVersionUID = 5611538616921447536L;

        private QueueIsEmptyException() {
            super("Current queue is empty");
        }
    }
}