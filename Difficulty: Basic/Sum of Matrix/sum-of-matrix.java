class Solution {
    public int sumOfMatrix(int[][] arr) {
        int n = arr.length;
        int m =arr[0].length;
        int sum =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum +=arr[i][j];
            }
        }
        return sum;
    }
}