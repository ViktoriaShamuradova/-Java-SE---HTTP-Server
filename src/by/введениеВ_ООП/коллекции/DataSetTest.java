package by.введениеВ_ООП.коллекции;

import by.введениеВ_ООП.коллекции.array.DynaArray;
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




        DataSet sets[] = {new DynaArray<Integer>(), new LinkedList<Integer>()};
        for(DataSet<Integer> d1 : sets) {
            System.out.println("------------------------------------");
            fillDataSet(d1, 0, 4);
            System.out.println(d1);
            System.out.println("size=" + d1.size());

            d.remove(0);
            d.remove(0);

            System.out.println(d1);
            System.out.println("size=" + d1.size());

            d1.clear(); // d1 = new LinkedList();

            fillDataSet(d1, 0, 99);

            System.out.println(d1.get(99));
            try {
                System.out.println(d1.get(999));
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }

            System.out.println(d1.remove(99));
            try {
                System.out.println(d1.remove(999));
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
    }

    private static void fillDataSet(DataSet<Integer> d1, int min, int max) {
        for (int i = min; i < max + 1; i++) {
            d1.add(i);
        }
    }

}
