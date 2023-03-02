public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        for (int i = 0; i<=25; i++){
            list.add(i);
        }
        System.out.println("list = "+ list);
        System.out.println("list.size() = "+ list.size());
        System.out.println("list.get(0) = "+ list.get(2));
        list.remove(6);
        ///System.out.println("list.clear() = " + list.clear());
    }
}
