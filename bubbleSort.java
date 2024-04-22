package Java_Sorting;

import java.util.Scanner;

class bubble {
    int arr[];

    public void func(int arr[]) {
        int arrs[] = this.arr;
    }

    public void BUbble(int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array After Sort:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter the Size of the Array"));
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Value in the Array");
        for (int i = 0; i < size; i++) {

        }

    }
}