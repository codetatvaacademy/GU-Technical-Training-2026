class Solution {
    public:
        vector<int> revisions(string& s1) {
            vector<int> result;
            int start = 0, end;
            while ((end = s1.find('.', start)) != string::npos) {
                result.push_back(stoi(s1.substr(start, end - start)));
                start = end + 1;
            }
            result.push_back(stoi(s1.substr(start)));
            return result;
        }
        int compareVersion(string version1, string version2) {
            vector<int> revision1 = revisions(version1);
            vector<int> revision2 = revisions(version2);
    
            int i = 0, j = 0;
            int size1 = revision1.size(), size2 = revision2.size();
            while (i < size1 || j < size2) {
                int r1, r2;
                if (i < size1) {
                    r1 = revision1[i];
                } else {
                    r1 = 0;
                }
                if (j < size2) {
                    r2 = revision2[j];
                } else {
                    r2 = 0;
                }
                if (r1 < r2) return -1;
                if (r1 > r2)return 1;
    
                i++;
                j++;
            }
            return 0;
        }
    };