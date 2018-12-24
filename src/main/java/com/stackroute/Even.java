package com.stackroute;
import java.lang.String;


public class Even {
    public String evencheck(int n) {

        if (n % 2 != 0 && n < 30 && n > 20) {
            return "tom";
        } else if (n % 2 == 0 && n < 30 && n > 20) {
            return "jerry";
        } else {
            return "invalid number";

        }
    }
}
