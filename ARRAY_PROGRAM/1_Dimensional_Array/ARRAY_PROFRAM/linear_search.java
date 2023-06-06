import java.util.Scanner;

public class linear_search {

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

    public static void Linear(int[] arr , int size) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the element to search in array using Linear search : ");
        int Key = scanner.nextInt();
        int count=0;
        for(int i=0;i<size;i++){
            if(arr[i]==Key){
                count++;
                break;
            }
        }
        if(count>0){
            System.out.println("True");
        }
        else if(count==0){
            System.out.println("False");
        }

        

         
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = scanner.nextInt();
        int arr[]= new int[size];
        InputArray(arr ,size);
        DisplayArray(arr,size);
        Linear(arr, size);
        //DisplayArray(arr, size);
    }
    
}
