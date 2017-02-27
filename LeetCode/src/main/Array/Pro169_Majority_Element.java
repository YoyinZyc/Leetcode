package main.Array;

import java.util.Arrays;

public class Pro169_Majority_Element {
	public int majorityElement(int[] nums) {
		 if(nums.length == 1){
	            return nums[0];
	        }
	        Arrays.sort(nums);
	        
	        int index = 0;
	        while((index <= nums.length/2)&&((index + nums.length/2)<nums.length)){
	            if (nums[index] == nums[index+nums.length/2]) {
					return nums[index];
				}
				index++;
	        }
	        
			return 0;
	}
}
//int major=num[0], count = 1;
//for(int i=1; i<num.length;i++){
//    if(count==0){
//        count++;
//        major=num[i];
//    }else if(major==num[i]){
//        count++;
//    }else count--;
//    
//}
//return major;
//}
//
//majority num的count肯定比其他num加起来的count多