package OOPSbyraghavsir.java;

public class _02_arraylist {
    public static class Arraylist{
        int[] arr = new int[5];
        int idx = 0;
        int size = 0;
        public void add(int ele) {
            arr[idx] = ele;
            idx++;
            size ++;
        }
    }
    public static void main(String[] args) {
        Arraylist arr = new Arraylist();
        arr.add(2);
        arr.add(1);
        System.out.println(arr.size);
    }
}
