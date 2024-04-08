package com.project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.entity.project;
import com.project.repository.projectRepository;

@Service
public class projectService {
	
	@Autowired
	private projectRepository pr;
	
	  @Transactional
	    public void startProject(int projectId) {
	        
	        Optional<project> optionalProject = pr.findById(projectId);
	        if (optionalProject.isPresent()) {
	            project project = optionalProject.get();
	            project.setStatus("running");
	            
	            pr.save(project);
	        } else {
	            throw new RuntimeException("Project not found with ID: " + projectId);
	        }
	    }
	  
	  public void endProject(int projectId) {
	        Optional<project> optionalProject = pr.findById(projectId);
	        if (optionalProject.isPresent()) {
	            project project = optionalProject.get();
	            project.setStatus("Closed");
	            pr.save(project);
	        } else {
	            throw new RuntimeException("Project not found with ID: " + projectId);
	        }
	    }

	    public void cancelProject(int projectId) {
	        Optional<project> optionalProject = pr.findById(projectId);
	        if (optionalProject.isPresent()) {
	            project project = optionalProject.get();
	            project.setStatus("Cancelled");
	            pr.save(project);
	        } else {
	            throw new RuntimeException("Project not found with ID: " + projectId);
	        }
	    }
}
