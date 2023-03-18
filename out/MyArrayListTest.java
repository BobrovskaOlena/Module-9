package MyArrayList;

import MyArrayList.MyArrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        for (int i = 0; i<=25; i++){
            list.add(i);
        }
        System.out.println("list = "+ list);
        System.out.println("list.size() = "+ list.size());
        System.out.println("list.get(2) = "+ list.get(2));
        list.remove(7);
        list.clear();

    }
}
