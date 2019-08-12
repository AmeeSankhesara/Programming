//Program to find sum of even after queries in O(N+Q) time and O(Q) space.
import java.util.Arrays;

public class SumofEvenAfterQueries {
    static public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int sum=0;
        for(int x:A)
        {
            if(x%2==0)
                sum+=x;
        }

        int[] ans = new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int val = queries[i][0];
            int index = queries[i][1];

            if(A[index]%2==0)
            {
                sum=sum-A[index];
            }
            A[index] = A[index]+val;
            if(A[index]%2==0)
            {
                sum=sum+A[index];
            }
            ans[i]=sum;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
        int[] A = {1,2,3,4};
        System.out.println(Arrays.toString(sumEvenAfterQueries(A,queries)));
    }
}
