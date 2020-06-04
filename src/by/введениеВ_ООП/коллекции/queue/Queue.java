package by.введениеВ_ООП.коллекции.queue;

import by.введениеВ_ООП.коллекции.linkedList.LinkedList;

public class Queue<E> {
    private LinkedList<E> list = new LinkedList<E>();

    public void add(E element) {
        list.add(element);
    }

    public E get() {
        return list.remove(0);
    }

    public int size() {
        return list.size();
    }
}
