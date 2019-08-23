//Program to remove given element from array in O(n) time and O(1) space.
//Example - Input - Array => {1,2,3,1}, val = {1}
//Output - length - 2 and array => {2,3}

public class RemoveElement {
    public static void main(String[] args) {
        int[] A={1,2,3,1};
        int val=1;
        System.out.println(removeElement(A,val));
    }
    public static int removeElement(int[] nums, int val) {
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                nums[j++]=nums[i];
            }
        }
        return j;
    }
}
