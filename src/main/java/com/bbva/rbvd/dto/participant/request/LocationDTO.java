package com.bbva.rbvd.dto.participant.request;

import java.io.Serializable;
import java.util.List;

public class LocationDTO implements Serializable {
    private List<AddressComponentsDTO> addressComponent;
    private List<String> locationTypes;

    public List<AddressComponentsDTO> getAddressComponent() {
        return addressComponent;
    }

    public void setAddressComponent(List<AddressComponentsDTO> addressComponent) {
        this.addressComponent = addressComponent;
    }

    public List<String> getLocationTypes() {
        return locationTypes;
    }

    public void setLocationTypes(List<String> locationTypes) {
        this.locationTypes = locationTypes;
    }
}
