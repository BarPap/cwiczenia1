package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int firstValue = 15;
        int secondValue = 15;
        int thirdValue = 13;

        System.out.println (sum (firstValue, secondValue, thirdValue));
    }

    public static int sum(int firstValue, int secondValue, int thirdValue)
    {
        if(firstValue == 13)
        {
            return 0;
        }
        else if (secondValue == 13)
        {
            return firstValue;
        }
        else if (thirdValue == 13)
        {
            return firstValue + secondValue;
        }
        else
        {
            return firstValue + secondValue + thirdValue;
        }
    }
}
