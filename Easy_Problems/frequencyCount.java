class frequencyCount{
  void frequencyCount(int arr[],int N,int P){
    std::vector<int> freq(N+1,0);
    for(int i:arr){
      if(i<=N) freq[i]++;
    }
    for(int i=;i i<=N; i++) arr[i-1] = freq[i];
  }
}

