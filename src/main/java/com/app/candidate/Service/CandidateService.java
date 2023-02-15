package com.app.candidate.Service;

import com.app.candidate.Entity.Candidate;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public interface CandidateService {
    public Optional<Candidate> getCandidate(Integer id);
    public List<Candidate> allCandidate();
    public Candidate saveCandidate(Candidate candidate);
    public void deleteCandidate(Integer id);
    public void updateCandidate(Candidate candidate);
}
