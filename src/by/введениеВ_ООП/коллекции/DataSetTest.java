package by.введениеВ_ООП.коллекции;

import by.введениеВ_ООП.коллекции.linkedList.LinkedList;

public class DataSetTest {
    public static void main(String[] args) {


        DataSet d = new LinkedList(); //new DynaArray();
        for (int i = 0; i < 5; i++) {
            d.add(i);
        }
        System.out.println(d);
        System.out.println("size=" + d.size);// ??????????????????????
        System.out.println("size=" + d.size());
        d.remove(0);
        d.remove(0);
        System.out.println(d);
        System.out.println("size=" + d.size());
        d.clear();
        for (int i = 0; i < 100; i++) {
            d.add(i);
        }
        System.out.println(d.get(99));
        System.out.println(d.get(999));
        System.out.println(d.remove(99));
        System.out.println(d.remove(999));
    }
}
