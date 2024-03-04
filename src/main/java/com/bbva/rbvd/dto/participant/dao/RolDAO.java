package com.bbva.rbvd.dto.participant.dao;


public class RolDAO {
    private Integer participantRoleId;
    private String insuranceCompanyRoleId;

    public Integer getParticipantRoleId() {
        return participantRoleId;
    }

    public void setParticipantRoleId(Integer participantRoleId) {
        this.participantRoleId = participantRoleId;
    }

    public String getInsuranceCompanyRoleId() {
        return insuranceCompanyRoleId;
    }

    public void setInsuranceCompanyRoleId(String insuranceCompanyRoleId) {
        this.insuranceCompanyRoleId = insuranceCompanyRoleId;
    }
}
