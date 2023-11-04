class ispair{
  bool ispair(String x){
    stack<char> s;
    for(int i=0;i<x.length();i++){
      if(x[i] == '{' || x[i] == '(' || x[i] == '[') s.push(x[i]);
      else if (s.empty() == true) return false;
      else{
        switch (x[i]){
          case ']':if (s.top() == '[') s.pop();
                  else return false;
                  break;
          case ')':if (s.top() == '(') s.pop();
                  else return false;
                  break;
          case '}':if (s.top() == '{') s.pop();
                  else return false;
                  break;
        }
      }
    }
    if(s.empty()==true) return true;
    return false;
  }
}
// https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1?page=1&difficulty=Easy&sortBy=submissions
