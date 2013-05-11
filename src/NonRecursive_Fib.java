/*
 * Program to write a non-recursive method for 
 * fibonacci sequence
 */
public class NonRecursive_Fib {
	
	//method of non recursive fibonacci 
	public static int noRecursionFib(int position)
	{
		int num1, num2, num3;
		num1 = -1; num2 = 1;
		for (int i = 0; i <= position; i++)
		{
			num3 = (num1 + num2);
			num1 = num2;
			num2 = num3;
			
		}//end for loop
		return num2;
	}//end method
	
	public static void main(String[] args) {
		
		//iterate to print the 10 first number of fibonacci sequence
		for(int i=0;i<10;i++){
			if(i==9){
				System.out.print(noRecursionFib(i));
			}
			else{
				System.out.print(noRecursionFib(i)+",");
			}
		}
	}//end main

}
