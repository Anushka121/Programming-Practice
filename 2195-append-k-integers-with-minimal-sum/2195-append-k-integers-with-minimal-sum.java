
        class Solution {
  public long minimalKSum(int[] nums, int k) {
    // sum of number(which means belong [1, k]) in origin array
    long taken = 0;
    Arrays.sort(nums);
    // pivot number
    int last = 0;
    for (int num : nums) {
      // detect duplicate number
      if (num <= k && num != last) {
        // found one in [1, k], so we increase k, as we need more to fill the taken number
        k++;
        taken += num;
      }

      // remember last number
      last = num;
    }

    return (long) (k + 1) * k / 2 - taken;
  }
}