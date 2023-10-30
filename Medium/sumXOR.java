class sumXOR{
  public static long sumXor(int n,int arr[]){
    long sum = 0;
    for (int i=0;i<32;i++){
      long zc=0, oc=0, intsum=0;
      for (int j=0;j<n;j++){
        if (arr[j]%2 == 0) zc++;
        else oc++;
        arr[j] /=2;
      }
      intsum = zc * oc *(1<<i);
      sum += intsum;
    )
    return sum;
    }
  }

  // https://practice.geeksforgeeks.org/problems/sum-of-xor-of-all-pairs0723/1
  
