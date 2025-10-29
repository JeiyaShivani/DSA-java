package Searching;

public class BinarySearch {
    public static int binarysearch(int[] arr,int target){
        int high=arr.length-1;
        int low=0;
        int mid= 0;
        while(low<=high){
            mid= (high+low)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                low=mid+1;
            } else if (arr[mid]>target) {
                high=mid -1;
            }
        }

        return -1;
    }
    public  static  int lowerbound(int[] a,int x){
        int high=a.length-1,low=0;
        int mid=0;
        int ans=high;
        while (high>=low){
            mid=(high+low)/2;
            if(a[mid]>=x){
                ans=mid;
                high=mid-1;
            } else if (a[mid]<x) {
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={3,7,9,34,56,78};
        int[] arr2={1,2,3,4,5,8,8,10,10,11};
        int target=78;
        System.out.println(binarysearch(arr,target));
        System.out.println(lowerbound(arr2,9));

    }
}
