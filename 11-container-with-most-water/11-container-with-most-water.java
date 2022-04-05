class Solution {
	public int maxArea(int[] height) {
		int i=0;
		int j=height.length-1;
		int ans = 0;
		while(i<j){
			int curr_sum = (height[i]<height[j])?(j-i)*height[i]:(j-i)*height[j];  //Calculating Current No Of Water
			ans = Math.max(ans,curr_sum);    //Assigning Max Ans
			
			if(height[i]<height[j]) i++;   //Updating Next Range to check for water
			else j--;
		}
		return ans;
	}
}