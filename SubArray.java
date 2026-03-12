import java.util.ArrayList;

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        int sum = 0;
        int start = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            while (sum > target && start < i) {
                sum -= arr[start];
                start++;
            }

           
            if (sum == target) {
                ans.add(start + 1);
                ans.add(i + 1);
                return ans;
            }
        }

        ans.add(-1);
        return ans;
    }
}