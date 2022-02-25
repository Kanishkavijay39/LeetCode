class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int low = i + 1;
			int high = nums.length - 1;
			while (low < high) {
				if (nums[low] + nums[high] == -nums[i]) {
					list.add(Arrays.asList(nums[low], nums[high], nums[i]));
					while (low < high && nums[low] == nums[low + 1]) {
						low++;
					}
					while (low < high && nums[high] == nums[high - 1]) {
						high--;
					}
					low++;
					high--;
				} else if (nums[low] + nums[high] < -nums[i]) {
					low++;
				} else {
					high--;
				}
			}
		}
		return list;
        
    }
}