package com.example.demo.Service;

import com.example.demo.Model.Employee;
import com.example.demo.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo empRepo;

    public List<Employee> getALlEmp(){
        List<Employee> emp = new ArrayList<>();
        for (Employee e:
                empRepo.findAll()) {
            emp.add(e);
        }
        return emp;
    }

    public Employee getEmpId(int id){
        return empRepo.findById(id).get();
    }

    public Employee addEmp(Employee emp){
        return empRepo.save(emp);
    }

    public void deleteEmp(int id){
        empRepo.deleteById(id);
        return;
    }


}
