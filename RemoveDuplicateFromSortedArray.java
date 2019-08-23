//Program to remove duplicate from array in O(n) time and O(1) space
//Example - Input - {1,2,2,3,4,5} => output - len = 5 and array = {1,2,3,4,5}
public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] A={1,2,2,3,4,5,5,5};
        System.out.println("Len of array after duplicate removal = "+removeDuplicates(A));
    }
    public static int removeDuplicates(int[] nums){
        int n = nums.length;
        if(n==0 || n ==1){
            return n;
        }
        int j = 0;
        for(int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[n-1];
        return j;
    }
}
