public class RemoveDuplicates {
    //Given nums = [1,1,2], return length = 2, with the first two elements of nums being 1 and 2 respectively.
    //Given nums = [0,0,1,1,1,2,2,3,3,4], return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
    //Sorted Array
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length-1 ; i++) {
            if(nums[i] != nums[i+1]){
                nums[j]= nums[i];
                j++;
            }
        }
        nums[j] = nums[nums.length-1];

//        for (int k = j+1; k <=nums.length-1 ; k++) {
//            nums[k]=0;
//        }

        for (int element: nums) {
            System.out.print(element+ " ");
        }

        return j+1;
    }

    public static void main(String[] args) {
//        int [] a = {1,1,1,2,2,3,3,4};
        int [] a = {1,1,2};
        RemoveDuplicates remove = new RemoveDuplicates();
        System.out.println("\nLength - "+remove.removeDuplicates(a));
    }
}
