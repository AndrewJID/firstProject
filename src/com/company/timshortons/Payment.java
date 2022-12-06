package com.company.timshortons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Payment {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public boolean validateCardNumber(String card) {
        Pattern pattern = Pattern.compile("^[0-9]{15}$");
        Matcher matcher = pattern.matcher(card);
        if (!matcher.find()) {
            return false;
        }
        return true;
    }
    public boolean validateExpiryDate(String expdate) {
        Pattern pattern = Pattern.compile("^[0-9]{2}/[2-9][0-9]$");
        Matcher matcher = pattern.matcher(expdate);
        if (!matcher.find()) {
            return false;
        }
        return true;
    }
    public boolean validateCvv(String cvvCheck) {
        Pattern pattern=Pattern.compile("^[0-9]{3}$");
        Matcher matcher=pattern.matcher(cvvCheck);
        if (!matcher.find()) {
            return false;
        }
        return true;
    }
    public boolean customerBalance(double total)
    {
        if(total<=20)
        {
            return true;
        }
        return false;
    }
}

