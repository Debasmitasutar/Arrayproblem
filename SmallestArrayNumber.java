package Basicjava;

public class SmallestArrayNumber {
    public static void main(String[] args) {
        int[] array = new int[]{34, 56, 78, 98, 45};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("smallestnumber is:" + min);
    }
}
