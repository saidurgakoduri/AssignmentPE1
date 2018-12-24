package com.stackroute;
import java.lang.String;
public class Reverse {
        public String checkreverse (String s1)
        {
            String  rev = "";

            for(int i =s1.length()-1;i>=0;i--) {
                rev = rev + s1.charAt(i);
            }
            return rev;



        }
    }


