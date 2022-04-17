package com.example.demo.controller;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeebyId(@PathVariable Long id){
        Employee employee =  employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id : "+id) );
    return ResponseEntity.ok(employee);
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee){

        Employee employeeDb =  employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id : "+id) );

        employeeDb.setFirstName(employee.getFirstName());
        employeeDb.setLastName(employee.getLastName());
        employeeDb.setEmailId(employee.getEmailId());

        return ResponseEntity.ok(employeeRepository.save(employeeDb));
    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
        employeeRepository.deleteById(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}
