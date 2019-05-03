package com.stackroute;

public class Factorial {

        public void getFactorial(){



        for (int i = 1; i<13; i++){
            int fact = 1;
            for (int j=1;j<=i;j++){

                fact = fact*j;

            }

            System.out.println(fact);
        }
    }
}
