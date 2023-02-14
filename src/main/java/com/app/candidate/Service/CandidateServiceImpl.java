package com.app.candidate.Service;

import com.app.candidate.Entity.Candidate;
import com.app.candidate.Repository.CandidateRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateServiceImpl implements CandidateService{

    public final CandidateRepository candidateRepository;

    public CandidateServiceImpl(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @Override
    public Optional<Candidate> getCandidate(Integer id) {
        return candidateRepository.findById(id);
    }

    @Override
    public List<Candidate> allCandidate() {
        return candidateRepository.findAll();
    }

    @Override
    public Candidate saveCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }
}
