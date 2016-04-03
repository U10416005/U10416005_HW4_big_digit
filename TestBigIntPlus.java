//U10416005ªL«Ø¦t

//import scanner to enter the number
import java.util.Scanner;

public class TestBigIntPlus{
	public static void main(String[] args){
		//create two scanners
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two integer to plus");
		String first = input.next();
		String second = input.next();
		//invoke BigIntPlus to caculate
		BigIntPlus og = new BigIntPlus(first,second);
		System.out.print("The sum is");
		og.printSum();
	}
}