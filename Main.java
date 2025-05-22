import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        int[] arr = {9,12,5,47,54,14};
        int option;
        Scanner sc = new Scanner(System.in);

        System.out.println("*******************************MENU********************************");
        System.out.println("1)Bubble Sort \n2)Optimized Bubble Sort \n 3)Selection sort \n4)Insertion sort \n5)Merge sort  \n6)Quick sort  \n7)EXIT");
        System.out.println("enter the option: ");

        boolean flag = true;
        while(flag){
            option = sc.nextInt();
            switch(option){

                case 1:
                    BubbleSort.BubbleSort(arr);
                    break;

                case 2:
                    BubbleSort.Optimized_BubbleSort(arr);
                    break;

                case 3:
                    SelectionSort.SelectionSort(arr);
                    break;

                case 4:
                    InsertionSort.InsertionSort(arr);
                    break;

                case 5:
                    MergeSort.mergeSort(arr,0,arr.length-1);
                    break;

                case 6:
                    QuickSort.quickSort(arr,0,arr.length-1);

                case 7:
                    flag=false;
                    break;
            }
        }






    }

}


