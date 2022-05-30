package com.cgal.swiftsandesh.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Getter
public class Employee {
    private long id;
    private String name;
    private String email;
}
