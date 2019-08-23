//Program to search insert position of given element in sorted array in
//O(logn) time and O(1) space
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int low =0;
        int high = nums.length;

        while (low<high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid]>target){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;

    }

    public static void main(String[] args) {
        int[] A =  {1,3,5,6};
        int target =  5;
        System.out.println("Insert Position = "+searchInsert(A,target));
    }

}
