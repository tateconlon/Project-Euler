
public class Problem4 {

	public static void main(String[] args) {
	
		int largest = 0;
		for(int i = 999; i >=100; i--)
			for(int j = 999; j >=100; j--)
			{
				int prod = i*j;
				if(isPalindrome(prod) && prod>largest)
				{
					largest = prod;
				}
			}
		System.out.println(largest);
	}

	private static boolean isPalindrome(Integer n)
	{
		String str = n.toString();
		for(int i = 0;i<str.length()/2;i++)
		{
			if(str.charAt(i) != str.charAt(str.length()-i-1))
				return false;
		}
		return true;
	}
}
