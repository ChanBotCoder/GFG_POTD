class topK{
  public vector<int> (vector<int>& nums, int k){
  map<int,int,greater<int>> mp;
  mapmulti<int,int,greater<int>> mpp;

  for(auto it:mp) mp[it]++;
  for(auto it:mpp) mpp.insert({it.second,it.first});

  vector<int> ans;
  int count = 0;
  for(auto it = mpp.begin(); it < mpp.end(); ++it){
    if(count == k) break;
    count ++;
    ans.push_back(it->second);
  }
  return ans;
}
}

// https://www.geeksforgeeks.org/problems/top-k-frequent-elements-in-array/1
