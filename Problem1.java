
public class Problem1 {
	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		do
		{
			if(i%3 == 0)
				sum += i;
			else if(i%5 ==0)
				sum += i;
			i++;
		}while(i<1000);
		System.out.println(sum);

	}

}
