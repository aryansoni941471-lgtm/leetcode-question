import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums1) {
            map.put(num, 1);
        }

        for (int num : nums2) {
            if (map.containsKey(num)) {
                set.add(num);
            }
        }

        int[] ans = new int[set.size()];
        int i = 0;

        for (int num : set) {
            ans[i] = num;
            i++;
        }

        return ans;
    }
}