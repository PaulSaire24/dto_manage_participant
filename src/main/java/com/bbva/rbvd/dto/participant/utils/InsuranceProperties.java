package com.bbva.rbvd.dto.participant.utils;

public enum InsuranceProperties {
    FIELD_INSURANCE_PRODUCT_ID("INSURANCE_PRODUCT_ID"),
    FIELD_INSURANCE_MODALITY_TYPE("INSURANCE_MODALITY_TYPE"),
    FIELD_INSURANCE_COMPANY_ID("INSURANCE_COMPANY_ID"),
    FIELD_PARTICIPANT_ROLE_ID("PARTICIPANT_ROLE_ID"),
    FIELD_INSURANCE_COMPANY_ROLE_ID("INSURANCE_COMPANY_ROLE_ID"),
    FIELD_INSURANCE_BUSINESS_NAME("INSURANCE_BUSINESS_NAME");
    private final String value;

    InsuranceProperties(String value) { this.value = value; }

    public String getValue() { return value; }

}
