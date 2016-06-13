package io.akeredolu;

import java.util.Scanner;

/**
 * Created by mikailaakeredolu on 6/12/16.
 */
public class InputHandler {

    String number = "";

    public int userPrompt(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 999999999");

        number = input.next();

       int num =  Integer.parseInt(number);

        return num;
    }

    public String converterMethod(int uInput){

        String temp;

      try{
          if(uInput < 100){
              temp = Decision.convertBelowHundred(uInput);
          }else if((uInput >=100) && (uInput < 1000)){
              temp = Decision.convertAbove100Below1000(uInput);
          }else if((uInput >= 1000) && (uInput < 1000000)){
              temp = Decision.convertAbove1000(uInput);
          } else if((uInput < 1) || (uInput >= 1000000000)){
            temp = "Invalid Input. Number must be between 1 and 999999999";
          }
          else {
              temp = Decision.convertAbove1000butBelow1000000(uInput);
          }
      }
      catch (Exception e) {
          temp = "Invalid Input. Number must be between 1 and 999999999";
      }
        if(uInput == 0){
            return "Zero Dollars";
        }else{
            return temp+= "Dollars";
        }
    }

}
