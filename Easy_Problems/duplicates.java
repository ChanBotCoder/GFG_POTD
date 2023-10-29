class duplicates{
  public static ArrayList<Integer> duplicates(int n,int arr[]){
    List<Integer> list = new ArrayList<Integer>();
    int a[] = new int[n];
    for(int i =0;i<n;i++) a[arr[i]] = a[arr[i]]+1;
    for(int i=0;i<n;i++){if (a[i]>1) list.add(i);}
    if(list.isEmpty()) list.add(-1);
    return new ArrayList(list);
    
  // https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/0
