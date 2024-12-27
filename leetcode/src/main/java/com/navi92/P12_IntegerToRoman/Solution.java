package com.navi92.P12_IntegerToRoman;

public class Solution {

    String[] VALUES = {"I", "V", "X", "L", "C", "D", "M"};

    public String intToRoman(int num) {
        StringBuilder output = new StringBuilder();
        int temp = num;
        int place = 0;
        while (temp > 0) {
            var decimal = temp % 10;
            temp /= 10;

            if (decimal < 4) {
                output.insert(0, VALUES[place].repeat(decimal));
            } else if (decimal == 4) {
                output.insert(0, VALUES[place]+VALUES[place+1]);
            } else if (decimal == 5) {
                output.insert(0, VALUES[place+1]);
            } else if (decimal < 9) {
                output.insert(0, VALUES[place+1]+VALUES[place].repeat(decimal-5));
            } else {
                output.insert(0, VALUES[place]+VALUES[place+2]);
            }

            place+=2;
        }
        return output.toString();
    }
}
