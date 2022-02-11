package com.combinators;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {


    private Boolean isValidEmail(String email){
        return email.contains("@");
    }

    private Boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07");
    }
    private Boolean isAdult(LocalDate dob){
        return Period.between(dob,LocalDate.now()).getYears()>16;
    }

    public Boolean customerValidation(Customer customer){
        return isValidEmail(customer.getEmail()) && isPhoneNumberValid(customer.getPhoneNumber()) && isAdult(customer.getDob());
    }
}
