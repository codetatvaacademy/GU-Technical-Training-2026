class Solution {
public:
    int maxSatisfied(vector<int>& customers, vector<int>& grumpy, int minutes) {
        int unsatisfied = 0, maxUnsatisfied = 0, satisfied = 0;

        for (int i = 0; i < minutes; i++) {
            unsatisfied += grumpy[i] * customers[i];
        }

        maxUnsatisfied = unsatisfied;

        for (int i = minutes; i < customers.size() && i >= 0; i++) {
            unsatisfied += grumpy[i] * customers[i];
            if (i - minutes >= 0) {
                unsatisfied -= grumpy[i - minutes] * customers[i - minutes];
            }
            maxUnsatisfied = max(maxUnsatisfied, unsatisfied);
        }

        satisfied = 0;

        for (int i = 0; i < customers.size(); i++) {
            satisfied += (1 - grumpy[i]) * customers[i];
        }

        return satisfied + maxUnsatisfied;
    }
};