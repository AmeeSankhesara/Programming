import java.util.*;

public class ThreeSumUsingHashCode {

    public static List<List<Integer>> FindthreeSum(int[] nums){
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<n-1;i++){
          //  HashMap<Integer,Integer> H = new HashMap<>();
            HashSet<Integer> H = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int x = -(nums[i]+nums[j]);
                if(H.contains(x)){
                    List<Integer> L = new ArrayList<>();
                    L.add(x);
                    L.add(nums[i]);
                    L.add(nums[j]);

                    Collections.sort(L);

                    if(result.contains(L)){
                        continue;
                    }
                    result.add(L);
                }else {
                    H.add(nums[j]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] A = {-1,0,1,2,-1,-4};
        System.out.println(Arrays.toString(FindthreeSum(A).toArray()));

    }


}
