
public class Problem2 {

	
	public static void main(String[] args) {
	
		int a = 1;
		int b = 2;
		int c = 0;
		int sum = 2;
		do
		{
			c = a + b;
			a = b;
			b = c;
			if(c %2 == 0)
				sum += c;
		}while(c<4000000);
		
		System.out.println(sum);
	}
	

}
