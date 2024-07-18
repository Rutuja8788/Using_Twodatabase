package com.example.demo.secondary.repository;

import com.example.demo.secondary.entity.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentInfoRepository extends JpaRepository<StudentInfo, Long>
{
}
