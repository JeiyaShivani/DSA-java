package Searching;

public class SearchInRotatedArr {
    public static int Search(int[]  a,int x){

        int low=0,high=a.length-1,mid=0;
        while (low<=high){
            mid=(high+low)/2;
            if(a[mid]==x)
               return mid;

            //identify the sorted half
            if(a[low]<=a[mid]){
                if(x>=a[low] && x<=a[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
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
