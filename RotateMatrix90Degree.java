//Program to rotate matrix 90 degree clockwise direction
public class RotateMatrix90Degree {
    public static void main(String[] args) {
        int[][] matrix = {{5, 1, 9,11},
                          {2, 4, 8,10},
                          {13, 3, 6, 7},
                          {15,14,12,16}};
        //To find rotated matrix by 90 degree in clockwise direction
        //First we reverse all columns
        reverseColumns(matrix);
        //Then we find transpose of it.
        transposeOfMatrix(matrix);
        //To print matrix
        printMatrix(matrix);
    }

    //Function to print matrix
    public static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    //Function to reverse columns by swaping each element one by one.
    public static void reverseColumns(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=matrix.length-1,k=0;k<j;k++,j--){
                int temp = matrix[k][i];
                matrix[k][i] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    //Function to find transpose of matrix
    public static void transposeOfMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}
