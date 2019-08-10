//Program to find closest sum to target of pair of three element in O(n^2) time using sorting
import java.util.Arrays;

public class ThreeSumClosestUsingSorting {

    public static int threeSumClosest(int[] nums, int target) {
        int min=Integer.MAX_VALUE;
        int result = 0;
        int n=nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n-1;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
                int sum = nums[i] + nums[l]+nums[r];
                int diff = Math.abs(sum - target);
                if(diff==0){
                    return sum;
                }

                if(diff<min){
                    min=diff;
                    result=sum;
                }

                if(sum<=target){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return result;

    }


    public static void main(String[] args) {
        int[] A={-1, 2, 1, -4};
        int target = 1;
        System.out.println("Sum of elements from array "+Arrays.toString(A) + " that is closest to "+target+" is = "+threeSumClosest(A,target));

    }
}
