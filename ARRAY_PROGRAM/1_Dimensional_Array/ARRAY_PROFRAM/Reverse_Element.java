import java.util.Scanner;

public class Reverse_Element {
    
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

    public static void Reverse(int[] arr , int size) {
        System.out.println(" element in array after reversing the array : ");
        int i,j;
        for( i=0,j=size-1; i<size/2;i++,j--){
            arr[i] = arr[i]+arr[j];
            arr[j] = arr[i]-arr[j];
            arr[i] = arr[i]-arr[j];

        } 
        System.out.println("i value is " +i);
        System.out.println("j value is " +j);   
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        int arr[]= new int[size];
        InputArray(arr ,size);
        DisplayArray(arr,size);
        Reverse(arr, size);
        DisplayArray(arr, size);
    }
}
