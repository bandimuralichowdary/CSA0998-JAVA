//Easy 12 *
import java.util.*;
class MatrixAddition_12 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int rows, cols, i, j;
        System.out.println("Enter the no of rows: ");
        rows=s.nextInt();
        System.out.println("Enter the no of columns: ");
        cols=s.nextInt();
        int mat1[][]=new int[rows][cols];
        int mat2[][]=new int[rows][cols];
        int res[][]=new int[rows][cols];
        System.out.println("Enter the elements in matrix 1: ");
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                mat1[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter the elements in matrix 2: ");
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                mat2[i][j]=s.nextInt();
            }
        }
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                res[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("Resulatant Addition Matrix is: ");
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                System.out.println(res[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
