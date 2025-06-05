package com.example.importantquestions.ARRAYS;
import java.util.*;
public class RotateImage {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int m=sc.nextInt();
        System.out.println("Enter the elements of the matrix");
        int[][] matrix=new int[m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        rotateimage(matrix);
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void rotateimage(int[][] matrix){
        int m=matrix.length;
        //Transpose of the matrix
        for(int i=0;i<m;i++){
            for(int j=i;j<m;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<m;i++){
            int left=0;
            int right=m-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }

    }
}
