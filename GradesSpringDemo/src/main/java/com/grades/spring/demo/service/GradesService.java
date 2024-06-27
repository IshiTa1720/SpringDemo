package com.grades.spring.demo.service;

import com.grades.spring.demo.model.GradesRequest;
import com.grades.spring.demo.model.GradesResponse;
import org.springframework.stereotype.Service;

@Service
public class GradesService {

    public GradesResponse calculateGrades (GradesRequest gradesRequest){
        GradesResponse gradesResponse = new GradesResponse();
        gradesResponse.setTotalScore(calculateTotalScore(gradesRequest));
        gradesResponse.setStatus(determineStatus(gradesResponse.getTotalScore()));
        return gradesResponse;
    }

    private int calculateTotalScore(GradesRequest gradesRequest){
        return gradesRequest.getMath() + gradesRequest.getBusiness() + gradesRequest.getBiology()
                + gradesRequest.getChemistry() + gradesRequest.getEnglish();
    }

    private String determineStatus(int totalScore){
        if(totalScore < 250){
            return "Fail";
        }
        return "Pass";
    }
}
