package com.kodilla.hibernate.manytomany.facade;

public class FindingProcessingException extends Exception {

    public static String ERR_NOT_FIND_COMPANY = "Company with this letters not exist";
    public static String ERR_NOT_FIND_EMPLOYEE = "Employee with this letters not exist";

    public FindingProcessingException(String message) {
        super(message);
    }
}
