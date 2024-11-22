import java.util.Arrays;

public class RotateArray
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = arr.length - 1;

        // Rotate the array by k steps
        reverse_array(arr, 0, n);
        reverse_array(arr, 0, k - 1);
        reverse_array(arr, k, n);

        System.out.println(Arrays.toString(arr));
    }

    public static void reverse_array(int[] arr, int i, int j) {
        int temp;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
