package IP;
import java.util.Scanner;

public class IP
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        ValidateIpv4Address obj = new ValidateIpv4Address();
        
        System.out.print("Enter the IP Address: ");
        String ip = scan.nextLine();
        
        boolean b = obj.checkIP(ip);
        
        if (b == true)
            System.out.println("Given IP is True");
        else
            System.out.println("Given IP is False");
	}
}
