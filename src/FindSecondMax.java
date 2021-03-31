
public class FindSecondMax {
	
	public static int [] data1 = {2,5,1,56,76,65,27,60} ;
	
	public static void main(String[] args)
	{
	int max =  data1[0];
	int Secondmax = data1[1];
	
	if (max < Secondmax)
	{
		 max = max+Secondmax;
		 Secondmax = max-Secondmax;
		 max = max- Secondmax ;
	}
	
	for (int i= 2; i<=data1.length-1;i++)
	{
		if (data1[i] > max )
		{
			max = data1[i];
		}
		else if (data1[i] > Secondmax)
		{
			Secondmax = data1[i];
		}
	}
	 System.out.println(Secondmax);
	}

}
