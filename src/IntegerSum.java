import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntegerSum {

    //Given nums = [2, 7, 11, 15], target = 9

    //Because nums[0] + nums[1] = 2 + 7 = 9,
    //return [0, 1].

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++){
            int item = target - nums[i];
            if(map.containsKey(item) && map.get(item)!=i){
                return new int[]{i,map.get(item)};
            }
        }
        return new int[]{-1,-1};
    }




    public static void main(String[] args) {
        int a[] = {2, 7, 11, 15}; int target=9;
        System.out.println(Arrays.toString(new IntegerSum().twoSum(a, target)));
    }

}
