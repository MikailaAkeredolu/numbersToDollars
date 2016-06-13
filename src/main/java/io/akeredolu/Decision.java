package io.akeredolu;

/**
 * Created by mikailaakeredolu on 6/11/16.
 */
public class Decision {

    public static final String[] belowHundred = {"","", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static final String[] belowTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

    public static String convertBelowHundred(int number ){
        if (number < 20 ){
            return belowTwenty[number];
        } else{
            return belowHundred[number / 10] + belowTwenty[number % 10];
        }
    }

    public static String convertAbove100Below1000(int number ){
        int hundreds = number /100;
        String result = "";
        result += addHundred(hundreds);
        result+= convertBelowHundred(number - (hundreds * 100));
        return  result;
    }

    public static String convertAbove1000(int number ){
        int thousand = number /1000;
        String result = "";
        result += addThousand(thousand);
        result+= convertAbove100Below1000(number - (thousand * 1000));
        return  result;
    }

    public static  String convertAbove1000butBelow1000000(int number){
        int million = number / 1000000;
        String result = "";
        result += addMillion(million);
        result+= convertAbove1000(number - (million * 1000000));
        return result;
    }


    public static String addHundred(int number){
        if(number == 0){
            return "";
        }else {
            return convertBelowHundred(number) + "Hundred";
        }
    }

    public static String addThousand(int number){
        if(number == 0){
            return "";
        }if (number > 99){
            return convertAbove100Below1000(number) + "Thousand";
        }else{
            return convertBelowHundred(number) + "Thousand";
        }
    }

    public static String addMillion(int number){
        if(number > 99){
            return convertAbove100Below1000(number) + "Million";
        }else{
            return convertBelowHundred(number) + "Million";
        }
    }
}





