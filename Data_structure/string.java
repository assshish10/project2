import java.util.*;
public class string{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input");
		String input = sc.nextLine();
		String str1 = "";
		String str2 = "";
		for(int i = 0;i<input.length();i++){
			if((int)input.charAt(i)>=48 && (int)input.charAt(i)<58){
				str2 +=input.charAt(i);
			}
			else{
				str1 +=input.charAt(i);
			}
		
		}
				System.out.println(str1+str2);


}




}