import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1234 {


    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //You can return the answer in any order.
    //
    //Example 1:
    //Input: nums = [2,7,11,15], target = 9Output: [0,1]Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    //Example 2:
    //Input: nums = [3,2,4], target = 6Output: [1,2]
    //Example 3:
    //Input: nums = [3,3], target = 6Output: [0,1]
    //
    //Constraints:
    //2 <= nums.length <= 104
    //-109 <= nums[i] <= 109
    //-109 <= target <= 109
    //Only one valid answer exists.
    //
    //
    public static int[] solve(int[] nums, int target) {
//          int sum = 0;
//
//          for(int num : nums){
//              sum+=num;
//          }
//        List<Integer> pair_List  = new ArrayList<>();
//          for (int i=0; i< nums.length; i++){
//              for(int j =)
//          }

        Map<Integer,Integer>  map = new HashMap<>();
                for(int i =0; i< nums.length; i++){
                    if(map.containsKey(target-nums[i])){
                        return new int[]{map.get(target-nums[i]),i};
                    }
                    map.put(nums[i],i);
                }
                return  new int[]{};

        }

    public static void main(String[] args) {
        int[] arr = {1,-2,1,0,2,5};
        int target = 0;

//        System.out.println());
        int[] result = solve(arr,target);
        System.out.println(result[0]);
        System.out.println(result[1]);

    }





}
