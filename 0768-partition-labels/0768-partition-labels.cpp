class Solution {
public:
    vector<int> partitionLabels(string s) {
    vector<int> last(26, -1); // To store the last occurrence of each character
        vector<int> result; // To store the size of each partition
        
        // Step 1: Record the last occurrence of each character
        for (int i = 0; i < s.size(); i++) {
            last[s[i] - 'a'] = i;
        }
        
        int start = 0, end = 0;
        
        // Step 2: Iterate through the string and partition
        for (int i = 0; i < s.size(); i++) {
            end = max(end, last[s[i] - 'a']); // Extend the current partition
            
            // If we reached the end of the current partition
            if (i == end) {
                result.push_back(i - start + 1); // Record the partition size
                start = i + 1; // Start a new partition
            }
        }
        
        return result;
    }
};