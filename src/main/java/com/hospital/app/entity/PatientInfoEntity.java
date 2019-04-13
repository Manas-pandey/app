package com.hospital.app.entity;

import javax.persistence.*;

@Entity
@Table( name ="patient_info")
public class PatientInfoEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name ="HOS_ID",unique = true)
    private Long hospitalId;

    @Column(name="PATIENT_NAME")
    private String patientFirstName;

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    @Column(name="PATIENT_LST_NAME")
    private String patientLastName;

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Column(name="AGE")
    private Integer age;
}
