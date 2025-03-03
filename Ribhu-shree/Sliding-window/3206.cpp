class Solution {
    public:
        int numberOfAlternatingGroups(vector<int>& colors) {
            int count=0;
            for(int i = 0; i< colors.size();i++){
                if(i == 0){
                    if(colors[colors.size()-1]== colors[i+1] && colors[i+1] != colors[i])count++;
    
                }else if(i==colors.size()-1){
                    if(colors[i-1] == colors[0] && colors[i-1] != colors[i])count++;
    
                }else{
                    if(colors[i-1] == colors[i+1] && colors[i-1] != colors[i])count++;
                }
            }
            return count;
        }
    };