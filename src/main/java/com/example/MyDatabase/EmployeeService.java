package com.example.MyDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;
	public String post(Employee e) {
		return ed.post(e);
	}
	public String postAll(List<Employee> e) {
		return ed.postAll(e);
	}
	public Employee getById(int id) {
		return ed.getById(id);
	}
	public List<Employee> getAll() {
		return ed.getAll();
	}
	public String deleteById(int id) {
		return ed.deleteById(id);
	}
	public String update(Employee e) {
		return ed.update(e);
	}
	public List<Employee> getByshift(String shift) {
		List<Employee> x=ed.getAll();
		List<Employee> a=x.stream().filter(z->z.getShift().equals(shift)).collect(Collectors.toList());
		return a;
	}
	public List<Employee> getBygender(String gender) {
		List<Employee> x=ed.getAll();
		List<Employee> a=x.stream().filter(z->z.getGender().equals(gender)).collect(Collectors.toList());
		return a;
	}
	public Employee getminsalary() {
		List<Employee> x=ed.getAll();
		Employee a=x.stream().min(Comparator.comparingInt(Employee::getSalary)).get();
		return a;
	}
	public Employee getmaxsalary() {
		List<Employee> x=ed.getAll();
		Employee a=x.stream().max(Comparator.comparingInt(Employee::getSalary)).get();
		return a;
	}
	public List<String> getByname(String gender) {
		List<Employee> x=ed.getAll();
		List<String> a=x.stream().filter(z->z.getGender().equals(gender)).map(y->y.getName()).collect(Collectors.toList());
		return a;
	}
	public List<Employee> getsalaryByRange(int num1,int num2) {
		List<Employee> x=ed.getAll();
		List<Employee> a=x.stream().filter(z->z.getSalary()>num1&&z.getSalary()<num2).collect(Collectors.toList());
		return a;
	}
	public List<Character> getlastcharName(String name) {
		List<Employee> x=ed.getAll();
		List<Character> a=x.stream().map(y->y.getName().charAt(y.getName().length()-1)).collect(Collectors.toList());
		return a;
	}

}
