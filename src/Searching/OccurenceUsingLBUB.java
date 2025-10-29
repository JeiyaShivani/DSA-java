package Searching;

public class OccurenceUsingLBUB {

    // in this soln when element does not exist it returns the position where it can be inserted
    public static int firstOccurenceLowerBound(int[] arr,int x) {
        int low=0,high=arr.length-1;
        int mid=0;
        while(low<=high){
            mid=(high+low)/2;
            if(arr[mid]>=x){

                high=mid-1; //we are moving to left side because we are trying to find the possible first occurence
            } else{
                low=mid+1;
            }
        }
        return low;
    }
    public static int lastOccurenceUpperBound(int[] arr, int x) {
        int low=0,high=arr.length-1;
        int mid=0;

        while(low<=high){
            mid=(high+low)/2;
            if(arr[mid]<=x){
                low=mid+1; //we are moving to right side because we are trying to find the possible first occurence
            } else{
                high=mid-1;

            }
        }
        return high;
    }
    public static void main(String[] args) {
        int[] arr={2,8,8,8,8,8,12,13};
        int x=12;
        System.out.println("First Occurence Using Lower Bound :"+firstOccurenceLowerBound(arr,x));
        System.out.println("Last Occurence Using Upper Bound :"+ lastOccurenceUpperBound(arr,x));


}
}
