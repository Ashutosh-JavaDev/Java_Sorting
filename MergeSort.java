package Java_Sorting;

import java.util.Scanner;

class merge {
    public void mergeSort(int arr[], int mid, int low, int high) {
        mid = low + (high - low) / 2;
        int i = low;
        int j = mid + 1;
        int k[] = new int[high - low + 1];
        int s = 0;
        while (i <= mid && j <= high) {
            if (arr[i] >= arr[j]) {
                k[s] = arr[i];
                i++;
                s++;
            } else {
                k[s] = arr[j];
                j++;
                s++;
            }

        }
        while (i <= mid) {
            k[s] = arr[i];
            s++;
            i++;
        }
        while (j <= high) {
            k[s] = arr[j];

            j++;
            s++;
        }
        for (int l = 0, m = low; l < k.length; l++, m++) {
            arr[m] = k[l];
        }
    }
}

public class MergeSort {

}
