package com.example.demo.controller;

import com.example.demo.Model.Employee;
import com.example.demo.Repository.EmployeeRepo;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService empService;

    @GetMapping(value = {"/all" , "" , "/"})
    public List<Employee> getALlEmp(){
        return empService.getALlEmp();
    }
    @GetMapping(value = "/id/{id}")
    public Employee getEmpId(@PathVariable int id){
        return empService.getEmpId(id);
    }
    @PostMapping(value = "/add")
    public Employee addEmp(@RequestBody Employee emp){
        return empService.addEmp(emp);
//        return emp;
    }
    @GetMapping(value = "/name/{name}")
    public List<Employee> getEmpName(@PathVariable String name)
    {
        List<Employee> answer = new ArrayList<>();
        List<Employee> emp =  empService.getALlEmp();
        for (Employee e:
             emp) {
            if(e.getName() == name){
                answer.add(e);
            }
        }
        return answer;

    }
    @GetMapping(value = "/salary/{salary}")
    public List<Employee> getEmpSalary(@PathVariable float salary)
    {
        List<Employee> answer = new ArrayList<>();
        List<Employee> emp =  empService.getALlEmp();
        for (Employee e:
                emp) {
            if(e.getSalary() == salary){
                answer.add(e);
            }
        }
        return answer;

    }

    @DeleteMapping(value = "/id/{id}")
    public void deleteEmp(@PathVariable int id){
        empService.deleteEmp(id);
    }

}
