package programs.forInterview.Arrays;

public class AddTwoMatricesArray {
    public static void main(String[] args) {
        int[][] matrix1 = {{3,2,5,},{7,3,1},{4,8,6}};
        int[][] matrix2 = {{2,4,5},{9,4,5},{1,2,3}};

        int[][] sumMatrix = new int[3][3];

        for(int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix2.length; j++){
               sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sumMatrix[i][j]+" ");
               }
            System.out.println();
        }

    }
}
