package by.введениеВ_ООП.коллекции;

import by.введениеВ_ООП.коллекции.Array.DynaArray;

public class AnonimClass {
    public static void main(String[] args) {
        DynaArray<Integer> d1 = new DynaArray<>();
        test(d1);
        DynaArray<Integer> d2 = new DynaArray<Integer>() {

            @Override
            public void add(Integer element) {
                if(size() < 10) {
                    super.add(element);
                }
            }
        };
        test(d2);
    }
    private static void test(DynaArray<Integer> d) {
        System.out.println(d.getClass());
        for(int i=0;i<100;i++) {
            d.add(i);
        }
        System.out.println("Size="+d.size());
    }
}