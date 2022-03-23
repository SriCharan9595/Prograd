package IP;
import java.util.StringTokenizer;

public class ValidateIpv4Address 
{
	boolean checkIP(String ipAdd)
    {
        StringTokenizer sep = new StringTokenizer(ipAdd, ".");
        int count = sep.countTokens();
        
        try
        {
        	if(count!=4)
        		return false;
        	else
        	{
        		int a = Integer.parseInt(sep.nextToken());
        		int b = Integer.parseInt(sep.nextToken());
        		int c = Integer.parseInt(sep.nextToken());
        		int d = Integer.parseInt(sep.nextToken());
        
        		if ((a>=0 && a<=255) && (b>=0 && b<=255) && (c>=0 && c<=255) && (d>0 && d<255))
        			return true;
        		else    
        			return false;
        	}	
        }
        
        catch(Exception e)
        {
        	return false;
        }
    }
}	