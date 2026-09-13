class Solution {
    public int median(int[][] arr) {
        
        int m = arr.length;
        int n = arr[0].length;

        int[] oneD = new int[m * n];

        int k = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                oneD[k++] = arr[i][j];
            }
        }
        
        Arrays.sort(oneD);
        
        int x = oneD.length;
        int mid = x/2;
        return oneD[mid];
        
    }
}