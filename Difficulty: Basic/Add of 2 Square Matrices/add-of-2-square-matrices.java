class Solution {
    public void addMat(int[][] a, int[][] b) {
       int n = a.length;
       int m = b.length;
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               a[i][j] =a[i][j]+b[i][j];
           }
       }
       
        
    }
}