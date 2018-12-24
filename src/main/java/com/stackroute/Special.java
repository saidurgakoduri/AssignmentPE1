package com.stackroute;
import java.lang.String;
public class Special {

        public  String checkspecial(char ch)
        {
            if(ch>=65 && ch<=90)
            {
                System.out.println("Upper case letter");
            }
            else if(ch>=97 && ch<=122)
            { return  "Lower case letter" ;
            }
            else if(ch>=48 && ch<=57)
            {
                return "digit";
            }
            else if((ch>=0 && ch<=47) || (ch>=58&& ch<=64) || (ch>=91 && ch<=96) || (ch>=123 && ch<=127))
            {
                return "Special symbol";
            }
            return null;
        }
    }

