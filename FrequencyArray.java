package Basicjava;



public class FrequencyArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 2, 5};
        int[] fr = new int[array.length];
        int visited = -1;
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited)
                fr[i] = count;
        }
        System.out.println();
        System.out.println("Element | Frequency");
        System.out.println();
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited)
                System.out.println(" " + array[i] + " - " + fr[i]);
        }
        System.out.println();
    }
}