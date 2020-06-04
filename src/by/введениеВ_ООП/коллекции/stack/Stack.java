package by.введениеВ_ООП.коллекции.stack;

import by.введениеВ_ООП.коллекции.Array.DynaArray;

public class Stack<T> {
    private DynaArray<T> list = new DynaArray<>();

    public void add(T element) {
        list.add(element);
    }

    public T get() {
        return list.remove(list.size() - 1);
    }

    public int size() {
        return list.size();
    }
}