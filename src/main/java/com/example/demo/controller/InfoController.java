package com.example.demo.controller;


import com.example.demo.primary.entity.CollegeInfo;
import com.example.demo.secondary.entity.StudentInfo;
import com.example.demo.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    @PostMapping("/college")
    public String addCollegeInfo(@RequestBody CollegeInfo collegeInfo) {
        infoService.saveCollegeInfo(collegeInfo);
        return "college registerd succefully";

    }

    @PostMapping("/student")
    public String addStudentInfo(@RequestBody StudentInfo studentInfo) {
        infoService.saveStudentInfo(studentInfo);
        return "student registed succefully";

    }

    @GetMapping("/college")
    public List<CollegeInfo> getAllCollegeInfo() {
        return infoService.getAllCollegeInfo();
    }

    @GetMapping("/student")
    public List<StudentInfo> getAllStudentInfo() {
        return infoService.getAllStudentInfo();
    }
}

