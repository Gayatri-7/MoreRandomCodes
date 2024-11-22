import java.util.Arrays;

public class TwoSum{
    public static void main (String[] args) {
        int[] arr={3,2,4};
        int target=6;
        int[] a=new int[2];
        
        for (int i=0;i<arr.length ;i++ ){
            for (int j=i+1;j<arr.length; j++ ) {
                if(arr[i]+arr[j]==target)
                {
                    a[0]=i;
                    a[1]=j;
                    break;
                    
                    
                    
                }
            }
        }
        System.out.print(Arrays.toString(a));
    }
}