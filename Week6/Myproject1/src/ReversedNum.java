//Q.4 Write a java program to print all numbers in reverse order (e.g 10 9 8 7 6 5 4 3 2 1)
public class ReversedNum {

		public static void main(String[] args) {
			int num1 = 1234567890,  reversed = 0;
			System.out.println("Number:" + num1);
			
			while(num1 !=0){
			    reversed = reversed * 10;
			    reversed = reversed + num1 % 10;
			    num1 = num1 / 10;
			}
			    System.out.println("Reverse number:" +reversed); 	

	  }
	}



