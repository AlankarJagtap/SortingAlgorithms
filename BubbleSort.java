import java.util.Arrays;

public class BubbleSort {
    public static void  BubbleSort(int[] arr){
        //Bubble sort(swap adjacent elements; at the end of each pass we will get the largest element for that pass)

        for(int step=0; step<arr.length-1;step++){
            for(int i=0;i<arr.length-step-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i]; //swap
                    arr[i]=arr[i+1];
                    arr[i+1]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void  Optimized_BubbleSort(int[] arr){
        //Bubble sort(swap adjacent elements; at the end of each pass we will get the largest element for that pass)
        // use swapp to set flag. to overcome best case :0(N2) in traditional case even in best case
        boolean swap=true;
        for(int step=arr.length-1;(step>=0) && swap;step--){
            swap=false;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i]; //swap
                    arr[i]=arr[i+1];
                    arr[i+1]= temp;
                    swap=true;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}


