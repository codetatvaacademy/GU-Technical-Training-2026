class Solution {
    public:
        vector<int> kWeakestRows(vector<vector<int>>& mat, int k) {
            vector<pair<int, int>> rows;
            vector<int> result;
            for (int i = 0; i < mat.size(); i++) {
                int count = 0;
                for (int j = 0; j < mat[0].size(); j++) {
                    if (mat[i][j] == 1) {
                        count++;
                    } else {
                        break;
                    }
                }
                rows.push_back({count, i});
            }
            sort(rows.begin(), rows.end());
            for (int i = 0; i < k; ++i) {
                result.push_back(rows[i].second);
            }
            return result;
        }
    };