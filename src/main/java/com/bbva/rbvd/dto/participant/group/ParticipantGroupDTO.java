package com.bbva.rbvd.dto.participant.group;

import com.bbva.rbvd.dto.participant.request.ParticipantsDTO;

import java.io.Serializable;
import java.util.List;

public class ParticipantGroupDTO implements Serializable {
    private String documentNumber;
    private String documentType;
    private List<ParticipantsDTO> participantList;


    public List<ParticipantsDTO> getParticipantList() {
        return participantList;
    }

    public void setParticipantList(List<ParticipantsDTO> participantList) {
        this.participantList = participantList;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }
}
