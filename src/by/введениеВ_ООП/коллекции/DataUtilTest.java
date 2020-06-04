package by.введениеВ_ООП.коллекции;

import by.введениеВ_ООП.коллекции.Array.DynaArray;
import by.введениеВ_ООП.коллекции.linkedList.LinkedList;

public class DataUtilTest {

    public static void main(String[] args) {
        LinkedList<Integer> result = DataUtil.newLinkedListWithDuplicates(testLinkedList(0), testLinkedList(5),
                testDynaArray(10), testLinkedList(15), testDynaArray(20));
        System.out.println("withDuplicates=" + result);

        result = DataUtil.newLinkedListWithDuplicates(new LinkedList<Integer>(), testLinkedList(5), testDynaArray(10),
                testLinkedList(15), testDynaArray(20));
        System.out.println("withDuplicates=" + result);

        DataSet<Integer> unique = DataUtil.newDataSetWithoutDuplicates(testLinkedList(0), testLinkedList(5),
                testDynaArray(0), testLinkedList(0), testDynaArray(10));
        System.out.println("unique.getClass()=" + unique.getClass());
        System.out.println("unique=" + unique);
        unique.add(0);
        unique.add(0);
        unique.add(0);
        System.out.println("unique=" + unique);
        System.out.println("----------------------immutable----------------------------");
        DataSet<Integer> immutable = DataUtil.newImmutableDataSet(result);
        System.out.println("immutable=" + immutable);
        immutable.clear();
        immutable.remove(0);
        immutable.add(333333);
        Object[] array = immutable.toArray();
        array[0] = null;
        System.out.println("immutable=" + immutable);
        System.out.println("immutable.size()=" + immutable.size());
        System.out.println("immutable.get(0)=" + immutable.get(0));
        System.out.println("immutable.getClass()=" + immutable.getClass());

        immutable = DataUtil.newImmutableDataSet(1, 2, 3);
        immutable.clear();
        immutable.remove(0);
        immutable.add(333333);
        System.out.println("immutable=" + immutable);
        System.out.println("immutable.size()=" + immutable.size());
        System.out.println("immutable.get(0)=" + immutable.get(0));
        System.out.println("immutable.getClass()=" + immutable.getClass());

        immutable = DataUtil.newImmutableDataSet(new Integer[] { 1, 2, 3 });
        immutable.clear();
        immutable.remove(0);
        immutable.add(333333);
        System.out.println("immutable=" + immutable);
        System.out.println("immutable=" + immutable);
        System.out.println("immutable.size()=" + immutable.size());
        System.out.println("immutable.get(0)=" + immutable.get(0));
        System.out.println("immutable.getClass()=" + immutable.getClass());

        Queue<Integer> queue = DataUtil.newQueue(testLinkedList(0));
        System.out.println("queue=" + queue);
        queue = DataUtil.newQueue(testDynaArray(5));
        System.out.println("queue=" + queue);
        queue = DataUtil.newQueue(new Integer[] { 1, 2, 3 });
        System.out.println("queue=" + queue);

        Stack<Integer> stack = DataUtil.newStack(testLinkedList(0));
        System.out.println("stack=" + stack);
        stack = DataUtil.newStack(testDynaArray(5));
        System.out.println("stack=" + stack);
        stack = DataUtil.newStack(new Integer[] { 1, 2, 3 });
        System.out.println("stack=" + stack);
    }

    private static DataSet<Integer> testLinkedList(int start) {
        DataSet<Integer> list = new LinkedList<>();
        for (int i = start; i < start + 5; i++) {
            list.add(i);
        }
        return list;
    }

    private static DataSet<Integer> testDynaArray(int start) {
        return new DynaArray<>(new Integer[] { start, start + 1, start + 2, start + 3, start + 4 });
    }
}