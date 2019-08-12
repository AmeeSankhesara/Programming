//Program to find min,max,mean,median,mode from given sample in O(1) time and space
import java.util.Arrays;

public class StatisticFromLargeSample {
    static double[] sampleStats(int[] count) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE,n=count.length, total = 0 , mode =0 ;
        long sum = 0,median=0;

        for(int i=0;i<n;i++)
        {
            if(count[i]==0) continue;
            min=Math.min(min,i);
            max=Math.max(max,i);
            sum=sum+(i*count[i]);
            total+=count[i];
            if(count[i]>count[mode]) mode=i;
        }

        int l=(total+1)/2,r=(total+2)/2,pos=0,m1=-1,m2=-1;
        for(int i=0;i<n;i++)
        {
            pos+=count[i];
            if(pos>=l && m1==-1) m1=i;
            if(pos>=r && m2==-1) m2=i;

            if(m1!=-1 && m2!=-1)
            {
                break;
            }
        }
        return new double[]{min,max,(double)sum/total,(double)(m1+m2)/2,mode};
    }

    public static void main(String[] args) {
        int[] count = {0,1,3,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(Arrays.toString(sampleStats(count)));
    }
}
