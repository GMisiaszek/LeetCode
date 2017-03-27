public class Solution {
    public int[][] setZeroes(int[][] matrix){
        boolean iszero=false;
        int i,j,k;
        for(i=0;i<matrix[0].length;i++){
            if(matrix[matrix.length-1][i]==0) {
                iszero=true;
                break;
        }
    }
        for(i=0;i<matrix.length;i++){
           for(j=0;j<matrix[0].length;j++){
               if(matrix[i][j]==0){
                   matrix[matrix.length-1][j]=0;
               }
           }
        }
        for(i=0;i<matrix.length-1;i++){
           for(j=0;j<matrix[0].length;j++){
               if(matrix[i][j]==0){
                   for(k=0;k<matrix[0].length;k++){
                       matrix[i][k]=0;
                   }
               }
           }
        }
        for(i=0;i<matrix[0].length;i++){
            if(matrix[matrix.length-1][i]==0){
                for(k=0;k<matrix.length;k++){
                    matrix[k][i]=0;
                }
            }
        }
        if(iszero==true){
            for(i=0;i<matrix[0].length;i++){
                matrix[matrix.length-1][i]=0;
            }
            
        }
   return matrix; }
}