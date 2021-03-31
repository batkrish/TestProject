import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String");
		String String1= sc.next();
		System.out.println("Enter 1st String");
		String String2= sc.next();
		sc.close();
		
		boolean Status = false;
		
		if(String1.length()== String2.length())
		{
			char[] arr = String1.toLowerCase().toCharArray();
			char[] arr1 = String2.toLowerCase().toCharArray();
			
			System.out.println(Arrays.toString(arr));
			
			Arrays.sort(arr);
			Arrays.sort(arr1);
			Status = Arrays.equals(arr, arr1);
		}
		
		if (Status == true)
		{
			System.out.println(String1+" And "+String2 +" are Anagrams" );
		}
		
		else
		{
			System.out.println(String1+" And "+String2 +" aren't Anagrams" );
		}

	}

}
