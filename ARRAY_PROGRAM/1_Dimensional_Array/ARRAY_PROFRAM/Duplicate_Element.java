import java.util.Scanner;

public class Duplicate_Element {

    public static void InputArray( int[] arr , int size) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Eelement in array : ");
        for(int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }  
    }

    public static void DisplayArray(int[] arr , int size) {
        System.out.println(" Element in array are  ");
        
        for(int i = 0; i < size; i++){
        System.out.println(" Element in array at pos "+ i+" : "  +arr[i]);
      
        
       }
    }

    public static int Duplicate(int[] arr , int size) {
        System.out.println(" Removing duplicate element in the array : ");
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        int arr[]= new int[size];
        InputArray(arr ,size);
        DisplayArray(arr,size);
        size = Duplicate(arr, size);
        DisplayArray(arr,size);
    }

    
}
