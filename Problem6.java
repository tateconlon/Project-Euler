
public class Problem6 {

	public static void main(String[] args)
	{
		int sumOfSquares = 0;
		int sumSquared = 0;
		
		for(int i = 0; i<=100;i++)
		{
			sumOfSquares += i*i;
			sumSquared += i;
		}
		int diff = sumSquared*sumSquared - sumOfSquares;
		System.out.println(diff);
	}
}
