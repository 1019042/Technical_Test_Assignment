/*
 * Program to write a method that
 * writes a number from 0 to 999,999 into English language
 */
public class Algorithm {
	
	 public static String NumberToText( int n)
	  {
	   if ( n < 0 )
	      return "Minus " + NumberToText(-n);
	   else if ( n == 0 )
	      return "";
	   else if ( n <= 19 )
	      return new String[] {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", 
	         "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", 
	         "Seventeen", "Eighteen", "Nineteen"}[n-1] + " ";
	   else if ( n <= 99 )
	      return new String[] {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", 
	         "Eighty", "Ninety"}[n / 10 - 2] + " " + NumberToText(n % 10);
	   else if ( n <= 199 )
	      return "One Hundred " + NumberToText(n % 100);
	   else if ( n <= 999 )
	      return NumberToText(n / 100) + "Hundreds " + NumberToText(n % 100);
	   else if ( n <= 1999 )
	      return "One Thousand " + NumberToText(n % 1000);
	   else if ( n <= 999999 )
	      return NumberToText(n / 1000) + "Thousands, " + NumberToText(n % 1000);
	   else 
	      return "";
	}
	public static void main(String[] args) {
		System.out.println(NumberToText(100282));

	}

}
