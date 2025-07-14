package com.example.importantquestions.ARRAYS;
import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the number of rows and columns:");
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int matrix[][]=new int[rows][columns];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
       System.out.println( spiral(matrix,rows,columns));
    }
    public static List<Integer> spiral(int[][] matrix, int rows, int columns) {
        List<Integer> list=new ArrayList<>();
        int left=0;
        int right=columns-1;
        int top=0;
        int bottom=rows-1;

        int dir=0;
        /*if dir=0 left to right  row stays constant   top++
             dir=1 top to down    col stays constant   right--
             dir=2 right to left  row stays constant   down--
             dir=3 down to top    col stays constant   left++
         */
        while (top <= bottom && left <= right) {
            if (dir==0) {
                for(int i=left;i<=right;i++){
                    list.add(matrix[top][i]);
                }
                top++;
            }
            if (dir==1) {
                for(int i=top;i<=bottom;i++){
                    list.add(matrix[i][right]);
                }
                right--;
            }
            if (dir==2) {
                for(int i=right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (dir==3) {
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[left][i]);
                }
                left++;
            }
            dir++;
            if (dir==4) {
                dir=0;
            }

        }
    return list;
    }
}
