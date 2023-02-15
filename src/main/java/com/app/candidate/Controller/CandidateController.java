package com.app.candidate.Controller;

import com.app.candidate.Entity.Candidate;
import com.app.candidate.Service.CandidateService;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    private final CandidateService candidateService;

    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping("{id}")
    public Optional<Candidate> getCandidate(@PathVariable("id") Integer id){
        return candidateService.getCandidate(id);
    }

    @PostMapping
    public Candidate saveCandidate(@RequestBody Candidate candidate){
        return candidateService.saveCandidate(candidate);
    }
    @GetMapping
    public List<Candidate> allCandidate(){
        return candidateService.allCandidate();
    }

    @DeleteMapping
    public void deleteCandidate(@PathVariable("id") Integer id){
        candidateService.deleteCandidate(id);
    }
    @PutMapping
    public void updateCandidate(@RequestBody Candidate candidate){
        candidateService.updateCandidate(candidate);
    }
}
