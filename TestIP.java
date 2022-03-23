package IP;

import org.junit.Test;
import static org.junit.Assert.assertFalse;

public class TestIP
{
	ValidateIpv4Address obj = new ValidateIpv4Address();
	
	@Test
	public void pattern()
	{
		assertFalse(obj.checkIP("1.1..0"));
		assertFalse(obj.checkIP("10.0.1"));
		assertFalse(obj.checkIP("0..12.5"));
	}
	
	@Test
	public void e_and_b()
	{
		assertFalse(obj.checkIP("2.45.1.255"));
		assertFalse(obj.checkIP("55.0.2.0"));
		assertFalse(obj.checkIP("1.2.3.0"));
	}
	@Test
	public void limit() 
	{
		assertFalse(obj.checkIP("350.95.0.450"));
		assertFalse(obj.checkIP("5.400.75.120"));
		assertFalse(obj.checkIP("275.150.5.20"));
	}
}