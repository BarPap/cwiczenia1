package com.company;

public class Main {

    public static void main(String[] args)
    {
        int[] array = { 67, 8, 13, 3, 2, 1, 2, 3, 763, 1, 16, 3};

        int firstIndex = 0;
        int lastIndex = 0;
        boolean beExist = false;

        for (int i = 0; i < array.length; ++i)
        {
            if(array[i] == 1)
            {
                if(array[i + 1] == 2)
                {
                    if(array[i + 2] == 3)
                    {
                        beExist = true;
                    }
                }
            }
        }
        if(beExist == true)
        {
            System.out.println("Sequence of number 1, 2, 3 appears in the array");
        }
        else
        {
            System.out.println("Sequence of number 1, 2, 3 do not appears in the array");
        }
    }
}
