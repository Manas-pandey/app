package com.hospital.app.service;

import com.hospital.app.bean.PatientDetails;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
public class UserDetailsService  implements  IUserDetailsService{

    public void onboardPatient(PatientDetails patientDetails){

    }

    public Long getRegisteredUsersId(Long hospitalId){
        return null ;
    }
}
