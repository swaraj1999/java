//Write a program in java to display your name, address, gender and
//contact number. (Note: take all inputs through command line
//arguments)
import java.util.Scanner;
class ass1_2
{
	public static void main(String[] args)
	{
		Scanner Sc=new Scanner(System.in); //declaring the object
		System.out.println("ENTER NAME,ADDRESS,gender,PHN NO");
		String name=Sc.nextLine();         //nextLine = string input with space from user
		System.out.println("Name: "+name);
		String address=Sc.nextLine();         
		System.out.println("Address: "+address);
		String gender=Sc.next();           //next = string input without space from user
		System.out.println("Gender: "+gender);
		Long phn=Sc.nextLong();              //next = to get int value from user
		System.out.println("Phn no: "+phn);
	}
}