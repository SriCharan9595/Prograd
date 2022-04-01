package cheri;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestArchitect 
{
	CheckingArchitect test = new CheckingArchitect();
	
	@Test
	void unitsEqualizationAndConversion()
	{
		assertEquals(test.checkInputAndToSendMethods("1 cm = cm"),"1.0");
		assertEquals(test.checkInputAndToSendMethods("1 m = cm"), "100.0");
		assertEquals(test.checkInputAndToSendMethods("100 cm = km"), "0.001");
		assertEquals(test.checkInputAndToSendMethods("1 g = g"), "1.0");
		assertEquals(test.checkInputAndToSendMethods("0.1 kg = g"), "100.0");
		assertEquals(test.checkInputAndToSendMethods("0 c = f"), "32.0");
		assertEquals(test.checkInputAndToSendMethods("0 k = c"), "-273.0");		

	}
}
