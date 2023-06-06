import java.util.Scanner;
import java.util.Arrays;
public class Biggest_Element {

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

    public static int Biggest(int[] arr , int size) {
        
        int i,j,bgst=0;
        for( i=0; i<size;i++){
            if(bgst<arr[i]){
                bgst=arr[i];
            }

        } 
         
        return bgst;
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

    public static int Second_Biggest(int[] arr , int size,int bgst) {
        
        int i,j,s_bgst=0;
        for(i=0;i<size;i++){
            if(arr[i]==bgst){
                break;
            }
        }
        arr[0] = arr[0]+arr[i];
        arr[i] = arr[0]-arr[i];
        arr[0] = arr[0]-arr[i];

        
        for( i=1; i<size;i++){
            if(s_bgst<arr[i]){
                s_bgst=arr[i];
            }

        } 
         
        return s_bgst;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        int arr[]= new int[size];
        InputArray(arr ,size);
        Arrays.sort(arr);
        DisplayArray(arr,size);
        int bgst = Biggest(arr, size);
        System.out.println("Biggest element in array is : " + bgst);
        size = Duplicate(arr, size);
        int s_bgst = Second_Biggest(arr,size,bgst);
        System.out.println(" Second Biggest element in array is : " + s_bgst);
    }

    
}
