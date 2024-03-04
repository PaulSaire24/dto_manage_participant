package com.bbva.rbvd.dto.participant.request;

import java.io.Serializable;
import java.util.List;

public class ParticipantsDTO implements Serializable {
    private ParticipantTypeDTO participantType;
    private PersonDTO person;
    private List<IdentityDocumentDTO> identityDocuments;
    private List<ContactDetailsDTO> contactDetails;
    private List<AddressesDTO> addresses;

    public ParticipantTypeDTO getParticipantType() {
        return participantType;
    }

    public void setParticipantType(ParticipantTypeDTO participantType) {
        this.participantType = participantType;
    }

    public PersonDTO getPerson() {
        return person;
    }

    public void setPerson(PersonDTO person) {
        this.person = person;
    }

    public List<IdentityDocumentDTO> getIdentityDocuments() {
        return identityDocuments;
    }

    public void setIdentityDocuments(List<IdentityDocumentDTO> identityDocuments) {
        this.identityDocuments = identityDocuments;
    }

    public List<ContactDetailsDTO> getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(List<ContactDetailsDTO> contactDetails) {
        this.contactDetails = contactDetails;
    }

    public List<AddressesDTO> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressesDTO> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "ParticipantsDTO{" +
                "participantType=" + participantType +
                ", person=" + person +
                ", identityDocument=" + identityDocuments +
                ", contactDetails=" + contactDetails +
                ", addresses=" + addresses +
                '}';
    }
}
