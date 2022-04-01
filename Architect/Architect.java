package cheri;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Architect {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		CheckingArchitect check = new CheckingArchitect();
		
		System.out.print("Enter the String: ");
		String archInput = scan.nextLine();
		
		if(check.checkInputAndToSendMethods(archInput)!=null)
			System.out.println(check.checkInputAndToSendMethods(archInput));
		else
			System.out.println("Invalid Format...");
	}
}
