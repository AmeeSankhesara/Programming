//Program to get indices of the two numbers such that they added up to a specific target in O(n) time.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] A = {2,5,5,11};
        int target = 10;
        System.out.println("Index of elements having sum as target value = "+ Arrays.toString(ReturnTwoSumIndex(A,target)));

    }

    //Function which returns indexes of two elements of array such that they added up to a specific target.
    public static int[] ReturnTwoSumIndex(int[] A,int target){
        int n = A.length;
        //Declare map to store array element and its index.
        Map<Integer,Integer> M = new HashMap<Integer,Integer>();

        //Insert array elements and its indexes in hash map
        for(int i=0;i<n;i++){
            M.put(A[i],i);
        }
        int x;

        //Traverse all element of array
        for(int i=0;i<n;i++){
            //Get the difference between current array element and target value store it in variable x
            //sum of current element and x should be same as target
            x = target-A[i];

            //Check that x is exists in hashmap if exists then return index of x in hashmap and current element's index
            if(M.containsKey(x) && M.get(x)!=i){
                return new int[] {i,M.get(x)};
            }
        }

        //Throw exception if sum of two element of array is not found
        throw new IllegalArgumentException("Not found Sum of two elements ");

    }

}
