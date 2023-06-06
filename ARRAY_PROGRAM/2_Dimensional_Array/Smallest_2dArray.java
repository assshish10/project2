import java.util.Scanner;
public class Smallest_2dArray {

    public static void Input( int[][] arr,int row,int col) {
        
        Scanner scanner = new Scanner(System.in);
        for(int i =0;i< row;i++){
            for(int j =0;j <col;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        
        
    }

    public static void Display( int[][] arr,int row,int col) {
       
        
        for(int i =0;i< row;i++){
            for(int j =0;j <col;j++){
                System.out.print(" "+arr[i][j]+"    "    );
            }
            System.out.println();
        }
    }
    public static int Smallest( int[][] arr,int row,int col) {
        
        int Smst = arr[0][0];
        for(int i =0;i< row;i++){
            for(int j =0;j <col;j++){
                if(arr[i][j]<Smst){
                    Smst = arr[i][j];
                }
            }
        }
        return Smst;
        
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of Row in matrix :      ");
        int row = scanner.nextInt();
        System.out.print("Enter no. of Cloumn in matrix :      ");
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];
        System.out.println(" Enter the element in First matrix");
        Input(arr,row,col);
        Display(arr, row, col);
        
        
        System.out.println(" Smallest element in matrix is    :    " + Smallest(arr, row, col));
       

    }

    
}
