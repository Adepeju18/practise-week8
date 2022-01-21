////Q.1 Write a java program to check whether number is prime or not a prime number.
public class PrimeNum {
	public static void main(String[] args) 
	{
		int num = 35;
		boolean isNotPrime = false;
		
		for(int i=2;i<num; i++)
		{
			if(num % i==0)
			{
				isNotPrime = true;
				break;
			}
		}
		
		if(isNotPrime)
			
		{
			System.out.println(num + "is not a prime number");
		}
		else
		{
			System.out.println(num + "is a prime number");
		}
	}
	}


