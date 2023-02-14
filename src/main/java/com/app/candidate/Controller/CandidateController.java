package com.app.candidate.Controller;

import com.app.candidate.Entity.Candidate;
import com.app.candidate.Service.CandidateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    private final CandidateService candidateService;

    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping("{candidateId}")
    public Optional<Candidate> getCandidate(@PathVariable("candidateId") Integer candidateId){
        return candidateService.getCandidate(candidateId);
    }

    @PostMapping("/save")
    public Candidate saveCandidate(@RequestBody Candidate candidate){
        return candidateService.saveCandidate(candidate);
    }
    @GetMapping
    public List<Candidate> allCandidate(){
        return candidateService.allCandidate();
    }
}
