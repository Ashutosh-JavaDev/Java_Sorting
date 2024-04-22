package Java_Sorting;

import java.util.Scanner;

class Insertion {
    int arr[];

    public void func(int arr[]) {
        this.arr = arr;
    }

    public void insertion(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

public class insertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Insertion ob=new Insertion();
        
    }
}
