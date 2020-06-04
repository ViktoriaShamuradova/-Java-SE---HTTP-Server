package by.введениеВ_ООП.коллекции.Array;

import by.введениеВ_ООП.коллекции.DataSet;

import java.util.Arrays;

@SuppressWarnings("unchecked") //аннотация для подавления предупреждений компиляции о непроверенны универсальных операциях(не исключениях),т.к. приведения
//Это означает, что программист не хочет получать уведомления о них, которые он уже знает при компиляции конкретного вида бита кода
public class DynaArray<E> extends DataSet<E> {
    private E[] array;

    public DynaArray() {
        array = (E[])new Object[10]; //нужно приводить к типу E
    }

    public DynaArray(E[] array) {
    }

    @Override
    public void add(E element) {
        if (size == array.length) {
            E[] temp = array;
            array = (E[])new Object[temp.length * 2];
            for (int i = 0; i < temp.length; i++) {
                array[i] = temp[i];
            }
        }
        array[size++] = element;
    }

    @Override
    public E remove(int index) {
        if (index < size) {
            E value = array[index];
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[--size] = null;
            return value;
        }
        return null;
    }

    @Override
    public E get(int index) {
        if(index<size) {
            return array[index];
        }else {
            return null;
        }
    }

    @Override
    public void clear() {
        super.clear();
        array = (E[])new Object[10];
    }

    @Override
    public E[] toArray() {
        return Arrays.copyOf(array, size);
    }

}
