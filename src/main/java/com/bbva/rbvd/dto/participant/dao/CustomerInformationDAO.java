package com.bbva.rbvd.dto.participant.dao;

import java.io.Serializable;

public class CustomerInformationDAO implements Serializable {
    private String insuranceProductType;
    private String contactEmailDesc;
    private String customerPhoneDesc;
    private String clientLastName;
    private String insuredCustomerName;
    private String insuranceBusinessName;


    public String getContactEmailDesc() {
        return contactEmailDesc;
    }

    public void setContactEmailDesc(String contactEmailDesc) {
        this.contactEmailDesc = contactEmailDesc;
    }

    public String getCustomerPhoneDesc() {
        return customerPhoneDesc;
    }

    public void setCustomerPhoneDesc(String customerPhoneDesc) {
        this.customerPhoneDesc = customerPhoneDesc;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public String getInsuredCustomerName() {
        return insuredCustomerName;
    }

    public void setInsuredCustomerName(String insuredCustomerName) {
        this.insuredCustomerName = insuredCustomerName;
    }

    public String getInsuranceProductType() {
        return insuranceProductType;
    }

    public void setInsuranceProductType(String insuranceProductType) {
        this.insuranceProductType = insuranceProductType;
    }

    public String getInsuranceBusinessName() {
        return insuranceBusinessName;
    }

    public void setInsuranceBusinessName(String insuranceBusinessName) {
        this.insuranceBusinessName = insuranceBusinessName;
    }
}
