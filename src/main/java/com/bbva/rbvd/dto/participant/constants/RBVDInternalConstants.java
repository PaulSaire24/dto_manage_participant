package com.bbva.rbvd.dto.participant.constants;

public class RBVDInternalConstants {
    public enum Role {

        CONTRACTOR("1", "8","CONTRACTOR"),
        PAYMENT_MANAGER("7", "23","PAYMENT_MANAGER"),
        INSURED("2", "9","INSURED");
        private final String roleBank;
        private final String roleCompany;
        private final String description;

        Role(String roleBank, String roleCompany,String description) {
            this.roleBank = roleBank;
            this.roleCompany = roleCompany;
            this.description = description;
        }

        public String getRoleBank() { return roleBank; }
        public String getRoleCompany() { return roleCompany; }
        public String getDescription() { return description; }
    }

    public static final class Number{
        public static final String VEINTE = "20";
    }

    public enum TypeParticipant{
        NATURAL,
        LEGAL
    }

    public enum ParticipantType{
        CUSTOMER,
        NON_CUSTOMER;
    }
}
