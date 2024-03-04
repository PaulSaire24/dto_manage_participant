package com.bbva.rbvd.dto.participant.request;

import java.io.Serializable;

public class ContactDetailsDTO implements Serializable {
    private String contact;
    private String contactType;

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }
}
