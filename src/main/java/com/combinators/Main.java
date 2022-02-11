package com.combinators;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
Customer customer = new Customer("Odochi", "ODOCHI@GMAIL.COM","07067285662", LocalDate.of(1997,05,03));
CustomerValidatorService validatorService = new CustomerValidatorService();
        System.out.println(validatorService.customerValidation(customer));
    }
}
