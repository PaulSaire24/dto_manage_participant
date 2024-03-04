package com.bbva.rbvd.dto.participant.request;

import java.io.Serializable;

public class ContactDTO implements Serializable {
    private String contactDetailType;
    private String address;
    private String number;

    public String getContactDetailType() {
        return contactDetailType;
    }

    public void setContactDetailType(String contactDetailType) {
        this.contactDetailType = contactDetailType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "ContactDTO{" +
                "contactDetailType='" + contactDetailType + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
