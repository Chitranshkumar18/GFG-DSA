class Solution {
    static ArrayList<Integer> snakePattern(int arr[][]) {
      ArrayList<Integer> ans = new ArrayList<>();
      int n =arr.length;
      int m = arr[0].length;
      for(int i=0;i<n;i++){
          if(i%2==0){
              for(int j=0;j<m;j++){
                  ans.add(arr[i][j]);
              }
          }
          else{
              for(int j=m-1;j>=0;j--){
                  ans.add(arr[i][j]);
              }
          }
      }
       return ans; 
    }
}