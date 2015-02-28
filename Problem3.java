
public class Problem3 {

	public static void main(String[] args) {
		
		int p = 1;
		long num = 600851475143L;
		long largest = 0;
		do
		{
			if(num % p == 0)
			{
				if(IsPrime(p))
					largest = p;
			}
			p = p+2;
		}while (p < Math.sqrt(num));
		System.out.println(largest);
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
