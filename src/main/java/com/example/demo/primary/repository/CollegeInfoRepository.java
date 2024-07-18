package com.example.demo.primary.repository;


import com.example.demo.primary.entity.CollegeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeInfoRepository extends JpaRepository<CollegeInfo, Long>
{
}

