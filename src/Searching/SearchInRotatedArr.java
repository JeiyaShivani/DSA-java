package Searching;

public class SearchInRotatedArr {
    public static int Search(int[]  a,int x){

        int low=0,high=a.length-1,mid=0;
        while (low<=high){
            mid=(high+low)/2;
            if(a[mid]==x)
               return mid;

            //identify the sorted half

            //left half is sorted
            if(a[low]<=a[mid]) //this is the right condition dont check if arr[mid]>arr[high] will not be true for all cases
            {
                //checking if the element exists in the sorted part
                if(x>=a[low] && x<=a[mid]){
                    //if yes we eliminate the other half
                    high=mid-1;
                }
                else{

                    low=mid+1;
                }
            }

            //right half is sorted
            else{
                if(x>a[mid] && x<=a[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr={4,5,6,7,0,1,2};
        System.out.print(Search(arr,0));

    }
}
