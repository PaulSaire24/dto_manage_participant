package com.bbva.rbvd.dto.participant.request;

import java.io.Serializable;

public class DocumentTypeDTO implements Serializable {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DocumentTypeDTO{" +
                "id='" + id + '\'' +
                '}';
    }
}
