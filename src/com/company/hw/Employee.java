package com.company.hw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
    private int employeeId;
    private String eName;
    private String eEmail;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteEmail() {
        return eEmail;
    }

    public void seteEmail(String eEmail) {
        this.eEmail = eEmail;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", eName='" + eName + '\'' +
                ", eEmail='" + eEmail + '\'' +
                '}';
    }
    public static boolean Validate(String emailId)
    {
        Pattern pattern = Pattern.compile("^\\w+[@][a-z]+[\\.][a-z]+[\\.a-z]*$");
        Matcher matcher= pattern.matcher(emailId);
        return matcher.find();
    }
}
