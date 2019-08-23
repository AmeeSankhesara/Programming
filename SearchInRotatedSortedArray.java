//Program to search an element in a rotated sorted  array in O(logn) time.
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] A={4,5,6,7,0,1,2};
        int target = 0;
        System.out.println("Index of the element is : "+search(A,target));
    }

    //Function to search an element key in rotated sorted array
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int pivot = findpivot(nums,0,n-1);
        // If we didn't find a pivot, then
        // array is not rotated at all
        if(pivot==-1){
            return binarysearch(nums,0,n-1,target);
        }

        // If we found a pivot, then first
        // compare with pivot and then
        // search in two subarrays around pivot
        if(nums[pivot] == target){
            return pivot;
        }
        if(nums[0]<= target){
            return binarysearch(nums,0,pivot-1,target);
        }

        return binarysearch(nums,pivot+1,n-1,target);

    }

    /* Standard Binary Search function */
    public static int binarysearch(int[] nums,int low,int high,int target){
        if(high<low){
            return -1;
        }

        int mid = (high+low)/2;
        if(target==nums[mid]){
            return mid;
        }else if(target > nums[mid]){
            return binarysearch(nums,mid+1,high,target);
        }else{
            return binarysearch(nums,low,mid-1,target);
        }
    }

    /* Function to get pivot. For array
       3, 4, 5, 6, 1, 2 it returns
       3 (index of 6) */
    public  static int findpivot(int[] nums,int low,int high){
        // base cases
        if(high<low){
            return -1;
        }
        if(high==low){
            return low;
        }
        int mid = (low+high)/2;
        if(mid<high && nums[mid]>nums[mid+1]){
            return mid;
        }
        if(mid>low && nums[mid]<nums[mid-1]){
            return mid-1;
        }
        if(nums[low]>=nums[mid]){
            return findpivot(nums,low,mid-1);
        }
        return findpivot(nums,mid+1,high);

    }

}
