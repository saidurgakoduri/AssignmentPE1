package com.stackroute;

public class Palindrome {
    public int Palindrome(int n) {
        int reverse = 0, rem, temp, value1 = 0;
        int r, s = 0;
        temp = n;
        while (n != 0) {
            rem = n % 10;
            reverse = reverse * 10 + rem;
            n /= 10;
        }
        if (temp == reverse) {
            while (temp > 0) {
                r = temp % 10;
                if (r % 2 == 0) {
                    s = s + r;
                }
                temp = temp / 10;
            }
            if (s > 25) {
                System.out.println(reverse + " is a palindrome and the sum of even numbers is greater than 25");
            } else {
                System.out.println(reverse + " is a palindrome and the sum of even numbers is less than 25");
            }
        } else {
            System.out.println(temp + " is not palindrome");
        }
        return reverse;
    }
}