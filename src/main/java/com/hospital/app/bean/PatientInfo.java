package com.hospital.app.bean;


import java.util.List;

public class PatientInfo {

    private List<HealthParameters> healthParameters;

    private PatientDetails patientDetails;


    public List<HealthParameters> getHealthParameters() {
        return healthParameters;
    }

    public void setHealthParameters(List<HealthParameters> healthParameters) {
        this.healthParameters = healthParameters;
    }
    public PatientDetails getPatientDetails() {
        return patientDetails;
    }

    public void setPatientDetails(PatientDetails patientDetails) {
        this.patientDetails = patientDetails;
    }

}
