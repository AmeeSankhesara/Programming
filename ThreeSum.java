//Program to get pair of 3 elements  whose sum is 0 using sorting in O(n^2) time.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n;i++){
            int l = i+1;
            int r = n-1;
            int x = nums[i];

            while (l<r){
                if(x+nums[l]+nums[r]==0){
                    List<Integer> L = new ArrayList<Integer>();
                    L.add(x);
                    L.add(nums[l]);
                    L.add(nums[r]);
                    l++;
                    r--;
                    if(result.contains(L)){
                        continue;
                    }
                    result.add(L);
                }else if(x+nums[l]+nums[r] > 0){
                    r--;
                }else {
                    l++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        System.out.println(Arrays.toString(threeSum(A).toArray()));
    }

}
