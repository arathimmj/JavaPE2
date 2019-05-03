package com.stackroute;

public class PowerOf4 {

    public boolean checkPowerOf4(int num){

        while (num != 0 && num>=4){

            if (num % 4 == 0){
                num = num/4;
            }
            else{
                return false;
            }

        }

        if (num==1){
            return true;
        }
        else{
            return false;
        }

    }

}
