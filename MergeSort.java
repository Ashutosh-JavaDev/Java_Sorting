package Java_Sorting;
import java.util.Scanner;
class merge{
    public void mergeSort(int arr[],int mid,int low,int high){
        mid=(high+low)/2;
        int i=low;
        int j=mid+1;
        int k[]=new int[high-low+1];
        while(i<=mid && j<=high){
            if(arr[i]>=arr[j]){
                k[i]=arr[i];
                i++;
            }
            else{
                k[i]=arr[j];
                j++;
            }
            
        }
        while(i<=mid){
            
        }
    }
}
public class MergeSort {
    
}
