package com.company.day14;

public class Address {
    private String address1;
    private String address2;
    private String postCode;

    public Address(String address1, String address2, String postCode) {
        this.address1 = address1;
        this.address2 = address2;
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
