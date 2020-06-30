package by.введениеВ_ООП.коллекции.stack;

import by.введениеВ_ООП.коллекции.DataStructure;
import by.введениеВ_ООП.коллекции.array.DynaArray;

public class Stack<T> extends DataStructure<T> {

    public Stack() {
        super(new DynaArray<T>());
    }

    public Stack(DynaArray<T> dataSet) {
        super(dataSet);
    }

    @Override
    protected final int getCurrentIndex() {

        return size() - 1;
    }

    @Override
    protected RuntimeException createEmptyExceptionInstance() {
        throw new StackIsEmptyException();
    }


    // получаем массив в обратном порядке
    @Override
    protected T[] toArray() {
        T[] array = (T[]) new Object[dataSet.size()];
        for (int i = 0; i < dataSet.size(); i++) {
            array[i] = dataSet.get(dataSet.size() - 1 - i);
        }
        return array;
    }

    public static class StackIsEmptyException extends RuntimeException {
        private static final long serialVersionUID = 5611538616921447536L;

        private StackIsEmptyException() {
            super("Current stack is empty");
        }
    }
}