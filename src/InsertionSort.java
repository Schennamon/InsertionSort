import java.util.Random;

public class InsertionSort {

    int[] arr = new int[10];

    public void printArr(){
        for(int j : arr){
            System.out.print(j);
        }
        System.out.println();
    }

    public void randArr(){
        Random rnd = new Random();

        for(int i = 0; i < arr.length; i++){
            arr[i] = rnd.nextInt(10);
        }
    }

    public void sorting(){
        for(int i = 0; i < arr.length-1; i++){
            int j = i;

            while(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;

                if(j > 0)
                    j--;
            }
        }
    }

    InsertionSort(){
        randArr();
        System.out.println("Unsorted:");
        printArr();
        sorting();
        System.out.println("Sorted:");
        printArr();
    }

    public static void main(String[] args){
        new InsertionSort();
    }
}