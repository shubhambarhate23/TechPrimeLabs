package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.entity.project;
import com.project.repository.projectRepository;
import com.project.service.projectService;


@Controller
public class projectController {

	@Autowired
	private projectRepository pr;
	
	@Autowired
	private projectService ps;
	
	@GetMapping("/addproject")
	public String addpro()
	{
		return "Addproject";
	}
	
	@PostMapping("/submitProject")
	public String saveProject(@ModelAttribute project project)
	{
		pr.save(project);
		return "redirect:/addproject";
	}
	
	
	@GetMapping("/plist")
	public String projectList(Model model)
	{
		List<project> projects=pr.findAll();
		model.addAttribute("projects",projects);
		return "projectlist";
	}
	
	/*@PostMapping("/updateData")
    public String updateData(@RequestParam int projectId, @RequestParam String a) {
        
        if ("start".equals(a)) {
            ps.startProject(projectId);
        } else if ("end".equals(a)) {
            ps.endProject(projectId);
        } else if ("cancel".equals(a)) {
            ps.cancelProject(projectId);
        }
        return "redirect:/plist";
    }*/
	 @PutMapping("/startProject/{projectid}")
	    public ResponseEntity<String> startProject(@PathVariable int projectid) {
	       
	        ps.startProject(projectid);
	        return ResponseEntity.ok().body("Project started successfully.");
	    }
	 
	 @PutMapping("/endProject/{projectid}")
	    public ResponseEntity<String> endProject(@PathVariable int projectid) {
	        ps.endProject(projectid);
	        return ResponseEntity.ok().body("Project Closed successfully.");
	    }

	    @PutMapping("/cancelProject/{projectid}")
	    public ResponseEntity<String> cancelProject(@PathVariable int projectid) {
	        ps.cancelProject(projectid);
	        return ResponseEntity.ok().body("Project canceled successfully.");
	    }
}
