package Basicjava;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        //   0      1       2
        int[][] matrixForm = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    }
      public void matrixmethod(int[][]matrixForm){
        for(int i=0;i<matrixForm.length;i++){
            for (int j=0;j<matrixForm.length;j++){
                System.out.println(matrixForm[i][j]);
            }
            System.out.println();
        }
      }
    }

