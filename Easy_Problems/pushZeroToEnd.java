class pushZeroToEnd{
  public void pushZeroToEnd(int n,int arr[])){
    int count = 0;
    for(int i =0;i<n;i++){
      if(arr[i] != 0 & j < n) arr[count++] = arr[i];
    }
    while(count<n) arr[count++] = 0;
  }
}
// https://practice.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1
