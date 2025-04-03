package com.bench_connect.java_7;
import java.util.*;

class Employee implements Comparable<Employee> {
	    int id;
	    String name;
	    double salary;

	    public Employee(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    @Override
	    public int compareTo(Employee emp) {
	        return Integer.compare(this.id, emp.id); // Sorting by ID
	    }

	    @Override
	    public String toString() {
	        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
	    }
}

public class MyTreeSet {
	    public static void main(String[] args) {
	        TreeSet<Employee> employees = new TreeSet<>();
	        
	        employees.add(new Employee(101, "Maya", 50000));
	        employees.add(new Employee(102, "Max", 55000));
	        
	        System.out.println("Size of TreeSet: " + employees.size());
	        System.out.println("Employees: " + employees);
	    }
}
