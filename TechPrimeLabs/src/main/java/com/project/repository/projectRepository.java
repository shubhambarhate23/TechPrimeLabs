package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.project;

@Repository
public interface projectRepository extends JpaRepository<project, Integer>{

}
