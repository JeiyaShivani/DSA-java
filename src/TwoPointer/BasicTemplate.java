package TwoPointer;

public class BasicTemplate {
    public static void main(String[] args) {
        int[] arr={2,5,1,7,10};
        int k=14;
        int l=0,r=0,maxlen=0;
        int sum=0;
        while(r< arr.length){
            sum+=arr[r];

            //we check if the window is invalid
            while(sum>k){
                sum-=arr[l];
                l=l+1;
            }
            if(sum<=k){
                maxlen=Math.max(maxlen,r-l+1);
            }
            r=r+1;
        }
        System.out.println(maxlen+" "+sum);
    }
}
