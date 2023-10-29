class waves{
  public static void waves(int n,int a[]){
    int temp;
    for(i=0;i<n-1;i+=2){
      temp = a[i+1];
      a[i+1] = a[i];
      a[i] = temp;
    return a;

// https://practice.geeksforgeeks.org/problems/wave-array-1587115621/0
