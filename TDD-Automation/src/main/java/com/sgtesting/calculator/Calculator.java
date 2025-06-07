package com.sgtesting.calculator;

public class Calculator {
    /**
     * Method Name: Addition Method
     * Description:
     */
    public int addition(int number1, int number2)
    {
        int result=0;
        try
        {
            result=(number1 + number2);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return  result;
    }

    /**
     * Method Name: Addition Method
     * Description:
     */
    public int addition(int numbers[])
    {
        int result=0;
        try
        {
            for(int i=0;i<numbers.length;i++)
            {
                result=result+numbers[i];
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return  result;
    }

    /**
     * Method Name: Subtraction Method
     * Description:
     */
    public int subtraction(int number1, int number2)
    {
        int result=0;
        try
        {
            result=(number1 - number2);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return  result;
    }

    /**
     * Method Name: Subtraction Method
     * Description:
     */
    public int division(int number1, int number2)
    {
        int result=0;
        try
        {
            result=(number1 / number2);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return  result;
    }

    /**
     * Method Name: Subtraction Method
     * Description:
     */
    public int multiplication(int number1, int number2)
    {
        int result=0;
        try
        {
            result=(number1 * number2);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return  result;
    }

    /**
     * Method Name: Subtraction Method
     * Description:
     */
    public int multiplication(int numbers[])
    {
        int result=1;
        try
        {
            for(int i=0;i<numbers.length;i++)
            {
                result=result * numbers[i];
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return  result;
    }
}
