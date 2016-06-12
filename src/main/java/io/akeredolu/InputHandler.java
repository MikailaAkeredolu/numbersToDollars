package io.akeredolu;

import java.util.Scanner;

/**
 * Created by mikailaakeredolu on 6/12/16.
 */
public class InputHandler {

    String number = "";

    public int userPrompt(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");

        number = input.next();

       int num =  Integer.parseInt(number);

        return num;
    }

    public String converterMethod(int uInput){

        String temp;

       if(uInput < 100){
           temp = Decision.convertbelowHundred(uInput);
       }else if(uInput >=100 && (uInput < 1000)){
          temp = Decision.convertAbove100Below1000(uInput);
       }else if(uInput >= 1000 && (uInput < 1000000)){
           temp = Decision.convertAbove1000(uInput);
       }else {
           temp = Decision.convertAbove1000butBelow1000000(uInput);
       }
        return temp+= "Dollars";
    }

}
