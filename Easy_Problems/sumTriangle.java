class sumTriangle{
  public ArrayList<Integer> sumTriangle(int matrix[][],int n){
    int sum1 = 0,int sum2 =0;
    ArrayList<Integer> ans = new ArrayList<>();
    for(int i =0; i<n;i++){
      for(int j=0;j<n;j++){
        if (i<=j) sum1 += matrix[i][j];
        if (i>=j) sum1 += matrix[i][j];
    }
  }
    ans.add(sum1);
    ans.add(sum2);
    return ans;
  } 
}

https://www.geeksforgeeks.org/problems/sum-of-upper-and-lower-triangles-1587115621/1
