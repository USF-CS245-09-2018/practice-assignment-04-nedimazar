public class SelectionSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        SelectionSort n = new SelectionSort();
        n.selectionSort(a);
    }

    int findMin(int pos, int[] arr){
        int min = pos;
        for(int k = pos +1; k < arr.length; k++){
            if(arr[k] < arr[min]){
                min = k;
            }
        }
        return (min);

    }

    void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    void selectionSort(int[] arr){
        for (int i = 0; i< arr.length -1; i++){
            swap(i, findMin(i, arr), arr);
        }
    }




}
