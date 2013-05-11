/*
 * Program that prints numbers from 1 to 100 
 * For multiples of three, print "Stw"
 * For multiples of five, print "Ando"
 */
public class StwAndo {

	public static void main(String[] args) {
		
		for (int i=1;i<=100;i++){
			
			if(i%3==0){//check if number is multiple of 3
				System.out.println("Stw");
			}
			else if(i%5==0){//check if number is multiple of 5
				System.out.println("Ando");
			}
			else{// otherwise print the number
				System.out.println(i);
			}
		}//end for loop
	}//end main

}
