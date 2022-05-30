package com.cgal.swiftsandesh.service;

import com.cgal.swiftsandesh.domain.Employee;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    public Flux<Employee> getEmployees() {
        var e1 = new Employee(1L, "Yatin", "ymdoshi1987@gmail.com");
        var e2 = new Employee(2L, "Shreyas", "ymdoshi1987@yahoo.com");
        return Flux.just(e1,e2);
    }
}
