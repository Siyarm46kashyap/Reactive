package com.example.simple.simple.service;

import com.example.simple.simple.entity.Captain;
import com.example.simple.simple.repository.CaptainRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CaptainService {

  private final CaptainRepository captainRepository;

  public CaptainService(CaptainRepository captainRepository) {
    this.captainRepository = captainRepository;
  }

  public Captain saveData(Captain captain) {
    return captainRepository.save(captain);
  }

  public List<Captain> findAllCaptain() {
    return captainRepository.findAll();
  }

  public Optional<Captain> findCaptainById(Integer id) {
    return captainRepository.findById(id);
  }
}
