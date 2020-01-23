public class RemoveDuplicateElementsFromArray{

//    Given nums = [0,1,2,2,3,0,4,2], val = 2, return length = 5, containing 0, 1, 3, 0, and 4.

        public int removeElement(int[] nums, int val) {
            int j =0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]!=val){
                    nums[j]=nums[i];
                    j++;
                }
            }
            for (int element: nums) {
                System.out.print(element+ " ");
            }
            return j;
        }

    public static void main(String[] args) {
         int [] a = {0,1,2,2,3,0,4,2};
//         int [] a = {3,2,2,3};
         int val = 2;
//         int val = 3;

        RemoveDuplicateElementsFromArray rem = new RemoveDuplicateElementsFromArray();
        System.out.println("\nLength :: "+rem.removeElement(a,val));
    }
}
