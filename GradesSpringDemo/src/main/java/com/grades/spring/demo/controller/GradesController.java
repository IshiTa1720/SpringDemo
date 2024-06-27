package com.grades.spring.demo.controller;

import com.grades.spring.demo.model.GradesRequest;
import com.grades.spring.demo.model.GradesResponse;
import com.grades.spring.demo.service.GradesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GradesController {

    @Autowired
    private GradesService gradesService;

    @PostMapping("/grades")
    @ResponseBody//important
    public GradesResponse calculateGrades (@RequestBody GradesRequest gradesRequest){
        return gradesService.calculateGrades(gradesRequest);
    }

}
