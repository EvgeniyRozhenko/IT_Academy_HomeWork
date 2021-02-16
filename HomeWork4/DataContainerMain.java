package HomeWork4;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<Integer> arr = new DataContainer<>(new Integer[3]);
        arr.add(new Integer[]{1,2,3});
        arr.add((Integer) null);
        System.out.println(arr.toStringWithNull());
        arr.add(777);
        System.out.println(arr.toStringWithNull());
        arr.getItems();
        arr.delete(2);
        System.out.println(arr.toStringWithNull());
        arr.add(3,2);
        arr.add(777);
        arr.add(3);
        System.out.println(arr.toStringWithNull());
        arr.delete(Integer.valueOf(3));
        System.out.println(arr.toStringWithNull());

        DataContainer<Integer> arr2 = new DataContainer<>(new Integer[0]);
        System.out.println(arr2.add(9999));
        System.out.println(arr2.get(0));

        DataContainer<Integer> arr3 = new DataContainer<>(new Integer[5]);
        arr3.add(new Integer[] {5,99,null,0,-1});
        System.out.println(arr3.toStringWithNull());
        System.out.println(arr3.toString());

        arr3.sort(new IComparator<>());
        System.out.println(arr3.toStringWithNull());

        DataContainer<Integer> arr4 = new DataContainer<>(new Integer[10]);
        arr4.add(new Integer[]{1,46,83,769,0,-23,5,81,-1,3});
        System.out.println(arr4.toString());
        DataContainer.sort(arr4);
        System.out.println(arr4.toString());

//        arr.add(1);
//        System.out.println(arr.toString());
//        arr.add(0,0);
//        arr.add(8,4);
//        System.out.println(arr.toString());
//        arr.add(new Integer[]{10,3,7,89,0});
//        System.out.println(arr.toString());

//        System.out.println(a);
//        int[] arrInt = new int[]{1,3,2,1,8,5,0};
//        DataContainer.sortArrData(arrInt);
//        System.out.println(Arrays.toString(arrInt));
    }
}
