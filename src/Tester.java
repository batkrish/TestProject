
public class Tester {


	public static int [] data11 = {2,5,1,56,76,60,27,65} ;


	public static void main(String[] args)
	{
		int max = 0;
		int secondmax = 0;

		for (int i = 0; i < data11.length; i++)
		{
			if (max < data11[i])
			{
				secondmax = max;
				max = data11[i];
			}
			else if (data11[i]>secondmax) {
				secondmax = data11[i];
				
			}
		}
		System.out.println(secondmax);
	}

}
