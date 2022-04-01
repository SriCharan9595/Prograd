package cheri;

import java.util.StringTokenizer;

public class CheckingArchitect
{
	
	String checkInputAndToSendMethods(String archInput)
	{
		StringTokenizer sep = new StringTokenizer(archInput," ");
		int count = sep.countTokens();
		double answer;
		String result;
		
		if(count==4)
		{
			answer = checkEqualAndConversionCaseOfUnits(archInput);
			result = answer+"";
			return result;
		}
		else if(count==6)
		{
			answer = performOperationsWithUnits(archInput);
			result = answer+"";
			return result;
		}
		else
			return null;
	}

	Double checkEqualAndConversionCaseOfUnits(String archInput)
	{
		StringTokenizer sep1 = new StringTokenizer(archInput, " ");
		
        double inputNumber = Double.parseDouble(sep1.nextToken());
        String inputUnit = sep1.nextToken();
        String equal = sep1.nextToken();
        String outputUnit = sep1.nextToken();
        		
    //Length cm, m, km...    300 cm = m      		
        if(inputUnit.equals("cm") && outputUnit.equals("cm"))
        	return inputNumber;
        else if(inputUnit.equals("cm") && outputUnit.equals("m"))
        	return inputNumber/100;
        else if(inputUnit.equals("cm") && outputUnit.equals("km"))
        	return inputNumber/100000;
        else if(inputUnit.equals("m") && outputUnit.equals("m"))
        	return inputNumber;
        else if(inputUnit.equals("m") && outputUnit.equals("cm"))
        	return inputNumber*100;
        else if(inputUnit.equals("m") && outputUnit.equals("km"))
        	return inputNumber/1000;
        else if(inputUnit.equals("km") && outputUnit.equals("km"))
        	return inputNumber;
        else if(inputUnit.equals("km") && outputUnit.equals("cm"))
        	return inputNumber*100000;
        else if(inputUnit.equals("km") && outputUnit.equals("m"))
        	return inputNumber*1000;
        		
    //Weight g, kg...	500 g = kg
        else if(inputUnit.equals("g") && outputUnit.equals("g"))
        	return inputNumber;
        else if(inputUnit.equals("g") && outputUnit.equals("kg"))
        	return inputNumber/1000;
        else if(inputUnit.equals("kg") && outputUnit.equals("kg"))
        	return inputNumber;
        else if(inputUnit.equals("kg") && outputUnit.equals("g"))
        	return inputNumber*1000;
        		
    //Temperature k, f, c...	300 k = c
        else if(inputUnit.equals("k") && outputUnit.equals("k"))
        	return inputNumber;
        else if(inputUnit.equals("k") && outputUnit.equals("f"))
        	return 1.8*(inputNumber-273)+32;
        else if(inputUnit.equals("k") && outputUnit.equals("c"))
        	return inputNumber-273;
        else if(inputUnit.equals("f") && outputUnit.equals("f"))
        			return inputNumber;
       	else if(inputUnit.equals("f") && outputUnit.equals("k"))
       		return (0.56*inputNumber)+460;
       	else if(inputUnit.equals("f") && outputUnit.equals("c"))
       		return (0.56*inputNumber)-32;
       	else if(inputUnit.equals("c") && outputUnit.equals("c"))
        	return inputNumber;
        else if(inputUnit.equals("c") && outputUnit.equals("k"))
        	return inputNumber+273;
        else if(inputUnit.equals("c") && outputUnit.equals("f"))
        	return (inputNumber*1.8)+32;
        	
        return null;
        }
		
 
	Double performOperationsWithUnits(String archInput) 
	{
		StringTokenizer sep2 = new StringTokenizer(archInput, " ");
		
		double inputNumber_1 = Double.parseDouble(sep2.nextToken());
		String inputUnit_1 = sep2.nextToken();
		String operator = sep2.nextToken();
		double inputNumber_2 = Double.parseDouble(sep2.nextToken());
		String inputUnit_2 = sep2.nextToken();
		String equal = sep2.nextToken();

	//1 m + 100 cm =
		if(inputUnit_1.equals("cm") && inputUnit_2.equals("cm") && (operator.equals("+")))
			return inputNumber_1 + inputNumber_2;
		else if(inputUnit_1.equals("cm") && inputUnit_2.equals("m") && (operator.equals("+")))
			return inputNumber_1 + (inputNumber_2*100);
		else if(inputUnit_1.equals("cm") && inputUnit_2.equals("km") && (operator.equals("+")))
			return inputNumber_1 + (inputNumber_2*100000);
		else if(inputUnit_1.equals("m") && inputUnit_2.equals("m") && (operator.equals("+")))
			return inputNumber_1 + inputNumber_2;
		else if(inputUnit_1.equals("m") && inputUnit_2.equals("cm") && (operator.equals("+")))
			return inputNumber_1 + (inputNumber_2/100);
		else if(inputUnit_1.equals("m") && inputUnit_2.equals("km") && (operator.equals("+")))
			return inputNumber_1 + (inputNumber_2*1000);
		else if(inputUnit_1.equals("km") && inputUnit_2.equals("km") && (operator.equals("+")))
			return inputNumber_1 + inputNumber_2;
		else if(inputUnit_1.equals("km") && inputUnit_2.equals("cm") && (operator.equals("+")))
			return inputNumber_1 + (inputNumber_2/100000);
		else if(inputUnit_1.equals("km") && inputUnit_2.equals("m") && (operator.equals("+")))
			return inputNumber_1 + (inputNumber_2/1000);
		
	//2 m - 50 cm =
		if(inputUnit_1.equals("cm") && inputUnit_2.equals("cm") && (operator.equals("-")))
			return inputNumber_1 - inputNumber_2;
		else if(inputUnit_1.equals("cm") && inputUnit_2.equals("m") && (operator.equals("-")))
			return inputNumber_1 - (inputNumber_2*100);
		else if(inputUnit_1.equals("cm") && inputUnit_2.equals("km") && (operator.equals("-")))
			return inputNumber_1 - (inputNumber_2*100000);
		else if(inputUnit_1.equals("m") && inputUnit_2.equals("m") && (operator.equals("-")))
			return inputNumber_1 - inputNumber_2;
		else if(inputUnit_1.equals("m") && inputUnit_2.equals("cm") && (operator.equals("-")))
			return inputNumber_1 - (inputNumber_2/100);
		else if(inputUnit_1.equals("m") && inputUnit_2.equals("km") && (operator.equals("-")))
			return inputNumber_1 - (inputNumber_2*1000);
		else if(inputUnit_1.equals("km") && inputUnit_2.equals("km") && (operator.equals("-")))
			return inputNumber_1 - inputNumber_2;
		else if(inputUnit_1.equals("km") && inputUnit_2.equals("cm") && (operator.equals("-")))
			return inputNumber_1 - (inputNumber_2/100000);
		else if(inputUnit_1.equals("km") && inputUnit_2.equals("m") && (operator.equals("-")))
			return inputNumber_1 - (inputNumber_2/1000);

	//10 g + 1 kg = 
		else if(inputUnit_1.equals("g") && inputUnit_2.equals("g") && (operator.equals("+")))
			return inputNumber_1 + inputNumber_2;
		else if(inputUnit_1.equals("g") && inputUnit_2.equals("kg") && (operator.equals("+")))
			return inputNumber_1 + (inputNumber_2*1000);
		else if(inputUnit_1.equals("kg") && inputUnit_2.equals("kg") && (operator.equals("+")))
			return inputNumber_1 + inputNumber_2;
		else if(inputUnit_1.equals("kg") && inputUnit_2.equals("g") && (operator.equals("+")))
			return (inputNumber_1 + (inputNumber_2/1000));
	
	//2 kg - 500 g = 
		else if(inputUnit_1.equals("g") && inputUnit_2.equals("g") && (operator.equals("-")))
			return inputNumber_1 - inputNumber_2;
		else if(inputUnit_1.equals("g") && inputUnit_2.equals("kg") && (operator.equals("-")))
			return inputNumber_1 - (inputNumber_2*1000);
		else if(inputUnit_1.equals("kg") && inputUnit_2.equals("kg") && (operator.equals("-")))
			return inputNumber_1 - inputNumber_2;
		else if(inputUnit_1.equals("kg") && inputUnit_2.equals("g") && (operator.equals("-")))
			return inputNumber_1 - (inputNumber_2/1000);
		
		return null;
	}
	
}
