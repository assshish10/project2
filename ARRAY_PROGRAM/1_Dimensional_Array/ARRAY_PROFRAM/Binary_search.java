import java.util.Scanner;

public class Binary_search {

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

    public static void Binary(int[] arr , int size) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the element to search in array  using Binary search: ");
        int Key = scanner.nextInt();
        int count=0,high=size-1,low=0,mid;
        while(high>=low){
            mid = (low + high)/2;
            if(arr[mid] > Key ){
                high = mid-1;
            }
            else if(arr[mid] < Key){
                low = mid+1;
            }
            else{
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
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        int arr[]= new int[size];
        InputArray(arr ,size);
        DisplayArray(arr,size);
        Binary(arr, size);
        //DisplayArray(arr, size);
    }
    
}
