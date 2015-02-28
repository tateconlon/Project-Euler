
public class Problem7 {

	public static void main(String[] args) {

		int prime = 3;
		int count = 2;
		long time = System.currentTimeMillis();
		do
		{
			prime += 2;
			if(IsPrime(prime))
			{
				count++;
			}
		}while(count != 10001);
		time -= System.currentTimeMillis();
		System.out.println(prime + "\t" + time);
	}
	
	private static boolean IsPrime(int p)
	{
		if(p % 2 == 0)
			return false;
		for(int i = 3; i <= Math.sqrt(p); i= i+2)
			if(p % i == 0)
				return false;
		return true;
	}
	
	

}
