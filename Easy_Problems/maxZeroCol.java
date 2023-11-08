class maxZeroCol{
  int maxZeroColumns(int arr[][],int N){
    int index = -1,count = 0,prev = 0;
    for(int i=0;i<N;i++){
      count = 0;
      for(int j=0;j<N;j++){
        if (arr[j][i] == 0) count+=1;
      }
      if (count > prev){
        prev = count;
        index = i;
      }
    }
    return index;
  }
}

https://www.geeksforgeeks.org/problems/predict-the-column/1
