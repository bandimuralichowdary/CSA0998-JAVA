//Easy 11 *
import java.util.*;
class MatrixMultiplication_11{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int ar, ac, br, bc;
        System.out.println("Enter the rows of Matrix-A: ");
        ar=s.nextInt();
        System.out.println("Enter the cols of Matrix-A: ");
        ac=s.nextInt();
        System.out.println("Enter the rows of Matrix-B: ");
        br=s.nextInt();
        System.out.println("Enter the cols of Matrix-B: ");
        bc=s.nextInt();
        if(ac!=br){
            System.out.println("Matrix Multiplication is not possible!!");
            return;
        }
        int a[][]=new int[ar][ac];
        int b[][]=new int[br][bc];
        int res[][]=new int[ar][bc];
        System.out.println("Enter the elements of MATRIX-A: ");
        for(int i=0;i<ar;i++){
            for(int j=0; j<ac; j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter the elements of MATRIX-B: ");
        for(int i=0;i<br;i++){
            for(int j=0; j<bc; j++){
                b[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<ar;i++){
            for(int j=0; j<bc; j++){
                res[i][j]=0;
                for(int k=0; k<ac; k++){
                    res[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("The resultant Multiplication Matrix is: ");
        for(int i=0;i<ar;i++){
            for(int j=0; j<ac; j++){
                System.out.println(res[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
