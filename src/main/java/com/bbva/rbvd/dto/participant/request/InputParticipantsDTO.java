package com.bbva.rbvd.dto.participant.request;

import java.io.Serializable;
import java.util.List;

public class InputParticipantsDTO implements Serializable {
    private List<ParticipantsDTO> participants;
    private String quotationId;
    private String channelId;
    private String traceId;

    public List<ParticipantsDTO> getParticipants() {
        return participants;
    }

    public void setParticipants(List<ParticipantsDTO> participants) {
        this.participants = participants;
    }

    public String getQuotationId() {
        return quotationId;
    }

    public void setQuotationId(String quotationId) {
        this.quotationId = quotationId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    @Override
    public String toString() {
        return "ValidateParticipantDTO{" +
                "participants=" + participants +
                ", quotationId='" + quotationId + '\'' +
                ", channelId='" + channelId + '\'' +
                ", traceId='" + traceId + '\'' +
                '}';
    }
}
