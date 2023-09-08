package com.example.model;
import javax.persistence.*;
@Entity
@Table(name="employees")
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="emp_id")
private  Long id;
@Column(name="emp_name")
private String name;
@ManyToOne
@JoinColumn(name="dept_id")
private Department department;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(Long id, String name, Department department) {
	super();
	this.id = id;
	this.name = name;
	this.department = department;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}

}
