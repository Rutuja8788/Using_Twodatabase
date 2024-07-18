package com.example.demo.service;


import com.example.demo.primary.entity.CollegeInfo;
import com.example.demo.primary.repository.CollegeInfoRepository;
import com.example.demo.secondary.entity.StudentInfo;
import com.example.demo.secondary.repository.StudentInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoService {

    @Autowired
    private CollegeInfoRepository collegeInfoRepository;

    @Autowired
    private StudentInfoRepository studentInfoRepository;

    public void saveCollegeInfo(CollegeInfo collegeInfo) {
        collegeInfoRepository.save(collegeInfo);
    }

    public void saveStudentInfo(StudentInfo studentInfo) {
        studentInfoRepository.save(studentInfo);
    }

    public List<CollegeInfo> getAllCollegeInfo() {
        return collegeInfoRepository.findAll();
    }

    public List<StudentInfo> getAllStudentInfo() {
        return studentInfoRepository.findAll();
    }
}
