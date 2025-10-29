package Searching;

public class FirstLastOccurenceUsingBS {
    public static int firstOccurenceUsingRawBinarySearch(int[] arr,int x) {
        int low=0,high=arr.length-1;
        int mid=0;
        int ans=-1;
        while(low<=high){
            mid=(high+low)/2;
            if(arr[mid]==x){
                ans=mid;
                high=mid-1; //we are moving to left side because we are trying to find the possible first occurence
            } else if (arr[mid]>x) {
                high=mid-1;
            } else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int lastOccurenceUsingRawBinarySearch(int[] arr, int x) {
        int low=0,high=arr.length-1;
        int mid=0;
        int ans=-1;
        while(low<=high){
            mid=(high+low)/2;
            if(arr[mid]==x){
                ans=mid;
                low=mid+1; //we are moving to right side because we are trying to find the possible first occurence
            } else if (arr[mid]<x) {
                low=mid+1;
            } else{
                high=mid-1;

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,8,8,8,8,8,12,13};
        int x=12;
        System.out.println("First Occurence Using Lower Bound :"+firstOccurenceUsingRawBinarySearch(arr,x));
        System.out.println("Last Occurence Using Upper Bound :"+ lastOccurenceUsingRawBinarySearch(arr,x));
    }


}
