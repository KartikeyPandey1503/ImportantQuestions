package com.example.importantquestions.GRAPHS;
import java.util.*;
/*approach
iterate over each cell:
    dfs(i,j)
    island++;

    dfs(i,j):
        if water or visited:
            return
    mark visited
    dfs(i+1,j)
    dfs(i-1,j)
    dfs(i,j+1)
    dfs(i,j-1)
 */
public class NumberofIslands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter dimensions of a 2d matrix");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.printf("Enter elements");
        int matrix[][]=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.print(islands(matrix));
    }
    public static int islands(int[][] matrix) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0){
            return 0;
        }
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==1){
                    dfs(matrix,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public static void dfs(int[][] matrix,int i,int j){
       if(i<0 || i>= matrix.length || j<0 || j>=matrix[0].length || matrix[i][j]==0){
           return;
       }
       matrix[i][j]=0;//just to mark the cell as visited
        dfs(matrix,i+1,j);
        dfs(matrix,i-1,j);
        dfs(matrix,i,j+1);
        dfs(matrix,i,j-1);//time complexity O(n*m)
    }
}
