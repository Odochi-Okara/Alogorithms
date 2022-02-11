package com.practice;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumber("0706728566"));
        System.out.println(isPhoneNumber("09063337667"));
        System.out.println(isPhoneNumberValid.test("07067285661"));
        System.out.println(isBoolean.test(6,4));
    }

    static Boolean isPhoneNumber(String phoneNum) {
        return phoneNum.startsWith("07") && phoneNum.length() == 11;
    }

    static Predicate<String> isPhoneNumberValid = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    static BiPredicate<Integer, Integer> isBoolean = (number, num) -> {
        if (number > num)
            return true;
            return false;
    };
}
