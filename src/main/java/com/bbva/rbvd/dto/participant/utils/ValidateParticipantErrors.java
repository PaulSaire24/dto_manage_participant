package com.bbva.rbvd.dto.participant.utils;

public enum ValidateParticipantErrors {
    SELECT_DB_ORACLE_ERROR("BBVAE2000132", false, "Error al ejecutar la consulta a la BD. "),
    ERROR_BBVA_VALIDATION("BBVAE2094946", false, "Error por validación interna de BBVA. "),
    ERROR_INTERNAL_SERVICE_INVOKATION("BBVAE2094947", false, "Error en la invocación de servicio BBVA. "),
    TIMEOUT_ADD_PARTICIPANTS_RIMAC_ERROR("BBVAE2020044", false, "Actualmente, el servicio validar participantes de Rimac no está disponible debido a un tiempo de espera en la conexión. Te recomendamos intentar acceder a este servicio en unos minutos, gracias."),
    ERROR_NOT_FOUND("BBVAE2000136", false, "No se encontró mensaje del servidor");

    private final String adviceCode;
    private final boolean rollback;
    private final String message;

    public String getAdviceCode() { return adviceCode; }
    public boolean isRollback() { return rollback; }
    public String getMessage() { return message; }

    ValidateParticipantErrors(String adviceCode, boolean rollback, String message) {
        this.adviceCode = adviceCode;
        this.rollback = rollback;
        this.message = message;
    }
}
