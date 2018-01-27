package com.magicnumber.magicnumberr;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class magicNumber {
    @RequestMapping("/")
    public String magicnumberr(@RequestParam("number") int number){

        String magicNum = "Starting number is :" + number +"</br" +String.valueOf(number);
        while(number != 1){
            if( number % 2 ==0){
                number = number/2;
            }
            else if(number % 3 ==0){
                number = number*3+1;
            }

            magicNum += String.valueOf(number)+ " ";
        }

        return magicNum;

    }


}
