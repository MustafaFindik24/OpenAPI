package com.app.candidate.Service;

import com.app.candidate.Entity.Candidate;

import java.util.List;

public interface CandidateService {
    public Candidate getCandidate(Long id);
    public List<Candidate> allCandidate();
    public Candidate saveCandidate(Candidate candidate);
}
