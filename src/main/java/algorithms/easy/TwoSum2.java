package algorithms.easy;

import java.util.*;

public class TwoSum2 {
	public int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	       
	        if (map.containsKey(complement)) { //check if hashmap has answer, check is instantaneous vs my iteration
	            return new int[] { map.get(complement), i };
	        }
	        map.put(nums[i], i); //fill everything up to i in hashmap.
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
}
