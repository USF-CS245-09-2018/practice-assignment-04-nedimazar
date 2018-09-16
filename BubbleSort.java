import java.util.Arrays;

public class BubbleSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        bubbleSort(a);
    }

    static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }



    public static int[] bubbleSort (int[] arr){

        boolean swapped = true;
        int last = 0;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < arr.length -1 - last; i++) {

                if (arr[i] > arr[i + 1]) {
                    swap(i, i + 1, arr);
                    swapped = true;
                }
            }
            last++;
        }
        return(arr);
    }

    public static void main(String args[]){
        int[] a = {2,65,4,5,1,3,45,667};
        BubbleSort b = new BubbleSort();
        System.out.println(Arrays.toString(a));
        b.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
