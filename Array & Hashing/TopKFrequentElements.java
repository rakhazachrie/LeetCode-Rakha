import java.util.*;

class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i<nums.length; i++){
            if (map.containsKey(nums[i])){
                int freq = map.get(nums[i]);
                freq++;
                map.put(nums[i], freq);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        int[] ans = new int[k];
        int j = 0;
        for (int i=0; i<k; i++){
            int freq = 0;
            int max = 0;
            for (Map.Entry<Integer, Integer> val : map.entrySet()){
                if (val.getValue() > freq){
                    freq = val.getValue();
                    max = val.getKey();
                }
            }
            map.put(max, 0);
            ans[j] = max;
            j++;
        }

        return ans;
    }
}