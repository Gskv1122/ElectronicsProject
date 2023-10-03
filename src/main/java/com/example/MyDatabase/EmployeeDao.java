package com.example.MyDatabase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	EmpRepo er;
	public String post(Employee e) {
		er.save(e);
		return "Data Saved Successfully";
	}
	public String postAll(List<Employee> e) {
		er.saveAll(e);
		return "data saved";
	}
	public Employee getById(int id) {
		return er.findById(id).get();
	}
	public List<Employee> getAll() {
		return er.findAll();
	}
	public String deleteById(int id) {
		er.deleteById(id);
		return "Data deleted";
	}
	public String update(Employee e) {
		er.save(e);
		return "Data updated";
	}
		


}
