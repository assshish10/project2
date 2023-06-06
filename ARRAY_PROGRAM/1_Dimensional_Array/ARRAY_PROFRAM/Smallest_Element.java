import java.util.Scanner;
import java.util.Arrays;

public class Smallest_Element {
    public static void InputArray( int[] arr , int size) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Eelement in array : ");
        for(int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }  
    }

    public static void DisplayArray(int[] arr , int size) {
        System.out.println(" Element in array are  ");
        int j=0;
       for (int i : arr) {
        System.out.println(" Element in array at pos "+ j+" : "  +i);
        j++;
        
       }
    }

    public static int Smallest(int[] arr , int size) {
        
        int i,j,sgst=arr[0];
        for( i=0; i<size;i++){
            if(sgst>arr[i]){
                sgst=arr[i];
            }

        } 
         
        return sgst;
    }

    public static int Duplicate(int[] arr , int size) {
        int i,j,k ,count=0;
        for(i=0;i<size;i++){
            for(j=i+1;j<size;){
                if(arr[i]==arr[j]){
                   for(k=j;k<size-1;k++){
                        arr[k] = arr[k+1];
                   }
                   size--;
                }
                else{
                    j++;
                } 

            }
        }

       

        return size;
    }

    public static int Second_Smallest(int[] arr , int size,int sgst) {
        
        int i,j,s_sgst=arr[1];
        for(i=0;i<size;i++){
            if(arr[i]==sgst){
                break;
            }
        }
        arr[0] = arr[0]+arr[i];
        arr[i] = arr[0]-arr[i];
        arr[0] = arr[0]-arr[i];

        
        for( i=1; i<size;i++){
            if(s_sgst>arr[i]){
                s_sgst=arr[i];
            }

        } 
         
        return s_sgst;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        int arr[]= new int[size];
        InputArray(arr ,size);
        Arrays.sort(arr);
        DisplayArray(arr,size);
        int sgst = Smallest(arr, size);
        System.out.println();
        System.out.println("Smallest element in array is : " + sgst);
        size = Duplicate(arr, size);
        int s_sgst = Second_Smallest(arr,size,sgst);
        System.out.println("Second Smallest element in array is : " + s_sgst);
    }

}
