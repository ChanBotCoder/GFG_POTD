class checkTriplet{
  bool checkTriplet(int arr[],int n){
    set<int> s;
    for(int i=0;i<n;i++) set.insert(arr[i]*arr[i]);
    for(int i=0;i<n;i++){
      for (int j=0;j<n;j++){
        if (set.find((arr[i]*arr[i])+(arr[j]*arr[j])) != s.end()) return true;
      }
    }
    return false;
  }
}

// https://www.geeksforgeeks.org/problems/pythagorean-triplet3018/1
