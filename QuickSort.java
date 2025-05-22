// for quick sort
public class QuickSort {

    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pIndex = func(arr,low,high);
            quickSort(arr,low,pIndex-1);
            quickSort(arr,pIndex+1,high);
        }
    }

    public static int func(int[] arr,int low,int high){

        int pivot = arr[low];
        int i = low;
        int j = high;
        int temp;

        while(i<j){

            while(arr[i]<=pivot && i<=high){
                i++;
            }
            while(arr[j]>=pivot && j>low){
                j--;
            }
            if(i<j){
                temp = arr[j];
                arr[j] = arr[i];
                arr[i]=temp;
            }

        }
        temp=arr[j];
        arr[j]=arr[low];
        arr[low]=temp;

        return j;

    }

}
