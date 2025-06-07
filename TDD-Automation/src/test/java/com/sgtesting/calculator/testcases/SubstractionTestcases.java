package com.sgtesting.calculator.testcases;

import com.sgtesting.calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubstractionTestcases {
	
	Calculator calculator=new Calculator();
	/**
	 * Created By:
	 * Description:
	 */
	@Test
	public void substractTwoPositiveNumbers()
	{
		int expected,actual;
		try
		{
			expected=60;
			actual=calculator.subtraction(100,40);
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Description:
	 */
	@Test
	public void substractTwoNegativeNumbers()
	{
		int expected,actual;
		try
		{
			expected=-21;
			actual=calculator.subtraction(-25,-4);
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Description:
	 */
	@Test
	public void substractPositiveAndNegativeNumbers()
	{
		int expected,actual;
		try
		{
			expected=53;
			actual=calculator.subtraction(50,-3);
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Description:
	 */
	@Test
	public void substractPositiveAndZeroNumbers()
	{
		int expected,actual;
		try
		{
			expected=40;
			actual=calculator.subtraction(40,0);
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
