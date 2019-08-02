import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;


/*给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。

你的算法时间复杂度必须是 O(log n) 级别。

如果数组中不存在目标值，返回 [-1, -1]。

示例 1:

输入: nums = [5,7,7,8,8,10], target = 8
输出: [3,4]
示例 2:

输入: nums = [5,7,7,8,8,10], target = 6
输出: [-1,-1]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/


public class Solution {



    public static void main(String[] args){
        int nums[] = {5,7,7,8,8,10};
                int target = 8;
        System.out.print("result="+ Arrays.toString(searchRange(nums,target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int pre,next;
        int position[]={-1,-1};
        int length=nums.length;
        if(length==1 && target==nums[0]){
            position[0]=0;
            position[1]=0;
            return position;
        }

        for(int i=0;i<length;i++){
            pre=i>0?nums[i-1]:nums[0];
            next=i<(length-1)?nums[i+1]:nums[i];
            if((i==0 || pre!=target) && nums[i]==target){
                position[0]=i;
            }
            if((i== length-1 || next!=target) && nums[i]==target){
                position[1]=i;
            }
        }
        return position;
    }


}
