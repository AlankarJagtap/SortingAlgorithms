public class MergeSort {

    public static void mergeSort(int[] arr,int l, int r){
        if(l>=r){
            return;
        }
        int mid = l+(r-l)/2;  //This prevents integer overflow in very large arrays:
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    public static void merge(int[] arr,int l,int mid,int r){
        int[] temp = new int[r-l+1];
        int left=l;
        int right=mid+1;
        int ptr=0;

        while(left<=mid && right<=r){
            if(arr[left]<=arr[right]){
                temp[ptr++] = arr[left++];
            }
            else{
                temp[ptr++] =arr[right++];
            }
        }
        while(left<=mid){
            temp[ptr++] =arr[left++];
        }
        while(right<=r){
            temp[ptr++] = arr[right++];
        }

        for(int i=0;i<temp.length;i++){
            arr[l+i] = temp[i];
        }
    }

}
