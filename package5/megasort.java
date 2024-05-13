package package5;

public class megasort {merge sort
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 6, 2};
        System.out.println("Before sorting:");
        for(int n: arr) {
            System.out.print(n + " ");
        }
        System.out.println();

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After sorting:");
        for(int n: arr) {
            System.out.print(n + " ");
        }

    }
    private static void mergeSort(int[] arr, int l, int r) {
        if(l < r) {
            int mid = (l + r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);

            merge(arr, l, mid, r);
        }
    }
    private static void merge(int[] arr, int l, int mid, int r) {
        int size1 = mid - l+1;
        int size2 = r - mid;

        int[] lArr = new int[size1];
        int[] rArr = new int[size2];

        for(int x = 0; x < size1; x++) {
            lArr[x] = arr[l + x];
        }
        for(int x = 0; x < size2; x++) {
            rArr[x] = arr[mid + 1 + x];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while(i < size1 && j < size2) {
            if(lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                i++;
            }
            else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        while(i < size1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while(j < size2) {
            arr[k] = rArr[j];
            j++;
            k++;
        }



    }



}
}
