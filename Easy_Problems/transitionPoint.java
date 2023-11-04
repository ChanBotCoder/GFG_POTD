class transitionPoint{
  public:
      int transitionPoint(int arr[],int n){
        for(int i=0;i<n;i++){
          if (arr[i] == 1) return i;
        }
        return -1;
      }
}
// https://www.geeksforgeeks.org/problems/find-transition-point-1587115620/1
