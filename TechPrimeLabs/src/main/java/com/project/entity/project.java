package com.project.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class project {

	@Id
	@GeneratedValue
	private int projectid;
	
	private String pname;
	
	private String reason;
	
	private String type;
	
	private String division;
	
	private String category;
	
	private String priority;
	
	private String department;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startdate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date enddate;
	
	private String location;
	
	private String status;

	public int getProjectid() {
		return projectid;
	}

	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public project(int projectid, String pname, String reason, String type, String division, String category,
			String priority, String department, Date startdate, Date enddate, String location, String status) {
		super();
		this.projectid = projectid;
		this.pname = pname;
		this.reason = reason;
		this.type = type;
		this.division = division;
		this.category = category;
		this.priority = priority;
		this.department = department;
		this.startdate = startdate;
		this.enddate = enddate;
		this.location = location;
		this.status = status;
	}

	public project() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "project [projectid=" + projectid + ", pname=" + pname + ", reason=" + reason + ", type=" + type
				+ ", division=" + division + ", category=" + category + ", priority=" + priority + ", department="
				+ department + ", startdate=" + startdate + ", enddate=" + enddate + ", location=" + location
				+ ", status=" + status + "]";
	}
	
	
	
	
	
}
