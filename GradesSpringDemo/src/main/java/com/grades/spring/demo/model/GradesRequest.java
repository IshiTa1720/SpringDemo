package com.grades.spring.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class GradesRequest {
    private int math;
    private int english;
    private int business;
    private int biology;
    private int chemistry;

}
