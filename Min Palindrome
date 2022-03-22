import java.util.Scanner;

public class minPalin 
{
	static void checkPalindrome(String palin)
    {
        int len = palin.length();
        String dup = palin;
        String rev;
        
        for(int i=0;i<len;i++)
        {
            for(int j=i;j>=0;j--)
            {
                dup+=palin.charAt(j);
            }
            
            rev = reverse(dup);
            
            if(dup.equals(rev))
                System.out.println("Minimum Palindrome is: " + dup);
            else
                dup = palin;
        }       
    }
    
    static String reverse(String check)
    {
        String rev="";
        int n=check.length()-1;
        
        for(int i=n;i>=0;i--)
        {
            rev=rev+check.charAt(i);
        }
        return rev;
    }

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String palindrome = scan.nextLine();
		
		checkPalindrome(palindrome);
	}
}
