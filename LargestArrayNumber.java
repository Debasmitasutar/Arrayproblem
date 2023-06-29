package Basicjava;


public class LargestArrayNumber {
    public static void main(String[] args) {
        int[] array = new int[]{34, 56, 78, 98, 45};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("largestnumber is:" + max);
    }
}
