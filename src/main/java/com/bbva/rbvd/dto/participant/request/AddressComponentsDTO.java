package com.bbva.rbvd.dto.participant.request;

import java.io.Serializable;
import java.util.List;

public class AddressComponentsDTO implements Serializable {
    private List<String> componentTypes;
    private String code;
    private String name;

    public List<String> getComponentTypes() {
        return componentTypes;
    }

    public void setComponentTypes(List<String> componentTypes) {
        this.componentTypes = componentTypes;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AddressComponentsDTO{" +
                "componentTypes=" + componentTypes +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
