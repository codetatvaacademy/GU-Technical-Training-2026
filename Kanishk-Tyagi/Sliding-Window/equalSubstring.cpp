class Solution {
public:
    int equalSubstring(string s, string t, int maxCost) {
        int start=0;
        int end=0;
        int cost=0;
        int length = 0;
        while(end<s.size()){
            cost += abs(s[end] - t[end]);
            while(cost>maxCost){
                cost -= abs(s[start]-t[start]);
                start ++;
            }
            length = max(length, end-start+1);
            end++;
        }
        return length;
    }
};
int main(){
  Solution sol;
  String s;
  cin>>s;
  String t;
  cin>>t;
  int maxCost;
  cin>>maxCost;
  int result = equalSubstring(s,t,maxCost);
  cout<<result;
  return 0;
}
