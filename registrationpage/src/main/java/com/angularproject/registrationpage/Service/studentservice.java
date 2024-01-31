package com.angularproject.registrationpage.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angularproject.registrationpage.Model.registration;
import com.angularproject.registrationpage.Repository.studentrepo;


@Service
public class studentservice{

    @Autowired
    studentrepo studentr;

    public registration addStudentService(registration student){
       if (student != null) {
           return this.studentr.save(student);
       } else {
           // Handle the case where student is null, maybe throw an exception or return null
           throw new IllegalArgumentException("Student object cannot be null");
       }
    }
}
