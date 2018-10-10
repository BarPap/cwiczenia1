package com.company;

public class Main {

    public static void main(String[] args) {
        int firstValue = 17;
        int secondValue = 31;

        boolean beTeen;

        beTeen = isTeen(firstValue, secondValue);
        if (beTeen == true) {
            System.out.println("True, one of this two object is teen");
        } else {
            System.out.println("False, both object are teen");
        }
    }

    public static boolean isTeen(int firstValue, int secondValue) {
        if ((firstValue < 13 || firstValue > 19) && secondValue >= 13 && secondValue <= 19) {
            return true;
        }
        if (firstValue >= 13 && firstValue <= 19 && (secondValue < 13 || secondValue > 19)) {
            return true;
        }
        if (firstValue >= 13 && firstValue <= 19 && secondValue >= 13 && secondValue <= 19) {
            return false;
        }
        return false;
    }
}