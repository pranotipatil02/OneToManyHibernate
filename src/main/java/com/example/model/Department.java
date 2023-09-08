package com.example.model;
import java.util.*;
import javax.persistence.*;
@Entity
@Table(name="departments")
public class Department {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="dept_id")
private Long id;
@Column(name="dept_name")
private String name;

@OneToMany(mappedBy="department",cascade=CascadeType.ALL,orphanRemoval=true)
private List<Employee> employees=new ArrayList<>();

public Department(Long id, String name, List<Employee> employees) {
	super();
	this.id = id;
	this.name = name;
	this.employees = employees;
}
public Department() {
	super();
	// TODO Auto-generated constructor stub
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
public List<Employee> getEmployees() {
	return employees;
}
public void setEmployees(List<Employee> employees) {
	this.employees = employees;
}

}
