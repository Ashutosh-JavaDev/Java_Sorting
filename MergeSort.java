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

    public void recursive(int arr[], int low, int high) {
        if (low > high) {
            int mid = low + (high - low) / 2;
            recursive(arr, low, mid);
            recursive(arr, mid + 1, high);
            mergeSort(arr, mid, low, high);
        }
    }
}

public class MergeSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        merge ob = new merge();
        System.out.println("Enter the size of the Array");
        int sze = sc.nextInt();
        int arr[] = new int[sze];
        System.out.println("Enter the Wvalue in the Array");
        for(int i=0;i<sze;i++){
            arr[i]=sc.nextInt();
        }
        ob.recursive(arr, 0, sze);
    }
}
