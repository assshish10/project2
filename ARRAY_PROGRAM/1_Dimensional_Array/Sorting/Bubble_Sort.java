import java.util.Scanner;

public class Bubble_Sort {

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

  /*public static void Bubble(int[] arr , int size) {
        System.out.println(" Array after Sorting the array using Bubble Sort : ");
        int i,j;
        for( i=0; i<size;i++){
            for(j=i+1;j<size;j++){
                if (arr[i] > arr[j]) {
                    arr[i] = arr[i]+arr[j];
                    arr[j] = arr[i]-arr[j];
                    arr[i] = arr[i]-arr[j];   
                }
            }
        }     
    }*/
    public static void selection(int[] arr , int size) {
        System.out.println(" Array after Sorting the array using Selection Sort : ");
        for(int i = 0; i< size;i++){
                int index =i;
            for(int j=i+1;j<size;j++){
                if(arr[j]<arr[index]){
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp; 
        }
        
        
        
        
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        int arr[]= new int[size];
        InputArray(arr ,size);
        DisplayArray(arr,size);
        //Bubble(arr, size);
        selection(arr, size);
        DisplayArray(arr, size);
    }
    
}
