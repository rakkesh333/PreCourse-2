// Time Complexity : O(n log(n))
// Space Complexity : O(n)
class QuickSort {
    
    void sort(int arr[], int low, int high) {
     
        if (low < high) { 
            int part = partition(arr, low, high);

           
            sort(arr, low, part - 1);
            sort(arr, part + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

       
      
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

          
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
               }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) {
        int arr[] = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n - 1);

        System.out.println("sorted array");
        printArray(arr);
    }
}