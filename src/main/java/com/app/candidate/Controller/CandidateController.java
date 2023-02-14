package com.app.candidate.Controller;

import com.app.candidate.Entity.Candidate;
import com.app.candidate.Service.CandidateService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    private final CandidateService candidateService;

    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping("/{id}")
    public Candidate getCandidate(@PathVariable Long id){
        return candidateService.getCandidate(id);
    }

    @PostMapping("/save")
    public Candidate saveCandidate(@RequestBody Candidate candidate){
        return candidateService.saveCandidate(candidate);
    }
}
