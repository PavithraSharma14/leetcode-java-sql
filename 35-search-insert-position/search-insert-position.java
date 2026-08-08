class Solution {
	public int searchInsert(int[] nums, int target) {
		if(nums == null || nums.length == 0) return 0;
		
		int n = nums.length;
		int l = 0;
		int r = n - 1;
		while(l < r){
			int m = l + (r - l)/2;
			
			if(nums[m] == target) return m;
			else if(nums[m] > target) r = m; 
			else l = m + 1; 
	}
    return nums[l] < target ? l + 1: l;
    }
}