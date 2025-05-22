import java.util.Arrays;

public class InsertionSort {
    public static void InsertionSort(int[] arr){
        int j;
        int temp;
        for(int i=0;i< arr.length;i++){
            j=i;
            while(j>0 && arr[j-1]>arr[j]){
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
