public class InsertionSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        InsertionSort n = new InsertionSort();
        n.insertionSort(a);
    }

    public int[] insertionSort(int[] arr){

        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int k = i-1;
            while((k >= 0) && (arr[k] > temp)){
                arr[k + 1] = arr[k];
                --k;
            }
            arr[k+1] = temp;
        }
        return(arr);
    }
}
