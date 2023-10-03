package com.example.MyDatabase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@PostMapping(value="/post")
	public String postvalues(@RequestBody Employee e) {
		return es.post(e);
	}
	@PostMapping(value="/postAll")
	public String postAll(@RequestBody List<Employee> e) {
		return es.postAll(e);
	}
	@GetMapping(value="/Get/{id}")
	public Employee getById(@PathVariable int id) {
		return es.getById(id);
	}
	@GetMapping(value="/GetAll") 
	public List<Employee> getAll() {
		return es.getAll();
	}
	@DeleteMapping(value="/delete/{id}")
	public String deleteById(@PathVariable int id) {
		return es.deleteById(id);
	}
	@PutMapping(value="/update")
	public String update(@RequestBody Employee e) {
		return es.update(e);
	}
	@GetMapping(value="/getByshift/{shift}")
	public List<Employee> getByshift(@PathVariable String shift) {
		return es.getByshift(shift);
	}
	@GetMapping(value="/getBygender/{gender}")
	public List<Employee> getBygender(@PathVariable String gender) {
		return es.getBygender(gender);
	}
	@GetMapping(value="/getmaxsalary")
	public Employee getmaxsalary() {
		return es.getmaxsalary();
	}
	@GetMapping(value="/getByname/{gender}")
	public List<String> getByname(@PathVariable String gender) {
		return es.getByname(gender);
	}
	@GetMapping(value="/getsalaryByRange/{num1}/{num2}")
	public List<Employee> getsalaryByRange(@PathVariable int num1,@PathVariable int num2) {
		return es.getsalaryByRange(num1,num2);
	}
	@GetMapping(value="/getlastcharName/{name}")
	public List<Character> getlastcharName(@PathVariable String name) {
		return es.getlastcharName(name);
	}
	
	
	
	
	

}
