public class RomanToInteger {
    /*
    Convert roman number to Integer
    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
    Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
    1. I can be placed before V (5) and X (10) to make 4 and 9.
    2. X can be placed before L (50) and C (100) to make 40 and 90.
    3. C can be placed before D (500) and M (1000) to make 400 and 900.
    Given a roman numeral, convert it to an integer.
    Input is guaranteed to be within the range from 1 to 3999.

    Input: "III"
    Output: 3

    Input: "IV"
    Output: 4

    Input: "IX"
    Output: 9

    Input: "MCMXCIV"
    Output: 1994
    */
    public static void main(String[] args) {
        System.out.println("Roman to Integer : "+romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s){
        int StrLength = s.length();
        char strchar;
        int value =0;
        int num = 0;
        int valueOfI =1;
        int valueOfV =5;
        int valueOfX =10;
        int valueOfL = 50;
        int valueOfC = 100;
        int valueOfD = 500;
        int valueOfM = 1000;
        for (int i =0;i<StrLength;i++){
             strchar = s.charAt(i);

             switch (strchar){
                 case 'I':
                     value = valueOfI;
                     if(i<StrLength-1 &&(s.charAt(i+1)=='V' || s.charAt(i+1)=='X')){
                         value = value-valueOfI;
                     }
                     break;
                 case 'V':
                     value = valueOfV;
                     if(i!=0 && s.charAt(i-1)=='I'){
                         value = value-valueOfI;
                     }
                     break;
                 case 'X':
                     value = valueOfX;
                     if(i!=0 && s.charAt(i-1)=='I'){
                         value = value-valueOfI;
                     }else if(i<StrLength-1 && (s.charAt(i+1)=='L' || s.charAt(i+1)=='C')){
                         value = value-valueOfX;
                     }
                     break;
                 case 'L':
                     value = valueOfL;
                     if(i!=0 && s.charAt(i-1)=='X'){
                         value = value - valueOfX;
                     }
                     break;
                 case 'C':
                     value = valueOfC;
                     if(i!=0 && s.charAt(i-1)=='X'){
                         value = value - valueOfX;
                     }else if(i<StrLength-1 && (s.charAt(i+1)=='D' || s.charAt(i+1)=='M')){
                         value = value-valueOfC;
                     }
                     break;
                 case 'D':
                     value = valueOfD;
                     if(i!=0 && s.charAt(i-1)=='C'){
                         value = value - valueOfC;
                     }
                     break;
                 case 'M':
                     value = valueOfM;
                     if(i!=0 && s.charAt(i-1)=='C'){
                         value = value - valueOfC;
                     }
                     break;
             }

             num = num+value;
        }
        return num;
    }
}
