//Write a program in java to calculate addition, subtraction,
//multiplication and division of two numbers. (Note: take all inputs
//through Scanner class. Write four different classes for addition,
//subtraction, multiplication and division and one main calss).
import java.util.Scanner;
class Mul{
	Scanner Sc = new Scanner(System.in);
	int a=Sc.nextInt();
	int b=Sc.nextInt();
	int mul(){
		int m=(a*b);
		return m;
	}
}