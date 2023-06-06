import java.util.Scanner;

public class Matrix_Addition {

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
    public static void Addition( int[][] arr1,int[][] arr2,int row,int col) {
        
        for(int i =0;i< row;i++){
            for(int j =0;j <col;j++){
                arr1[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of Row in matrix :      ");
        int row = scanner.nextInt();
        System.out.print("Enter no. of Cloumn in matrix :      ");
        int col = scanner.nextInt();
        int[][] arr1 = new int[row][col];
        System.out.println(" Enter the element in First matrix");
        Input(arr1,row,col);
        Display(arr1, row, col);
        System.out.println(" Enter the elemnet in Second matrix");
        int[][] arr2 = new int[row][col];
        Input(arr2,row,col);
        Display(arr2, row, col);
        Addition(arr1, arr2, row, col);
        System.out.println(" after addition the matrix are   :    ");
        Display(arr1, row, col);

    }
    
}
