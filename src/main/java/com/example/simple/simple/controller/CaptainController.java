package com.example.simple.simple.controller;

import com.example.simple.simple.entity.Captain;
import com.example.simple.simple.service.CaptainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CaptainController {
  private final CaptainService captainService;

  public CaptainController(CaptainService captainService) {
    this.captainService = captainService;
  }

  @GetMapping("/all")
  public List<Captain> getAllCaptain() {
    return captainService.findAllCaptain();
  }

  @PostMapping("/save")
  public Captain saveData(@RequestBody Captain captain) {
    return captainService.saveData(captain);
  }

  @GetMapping("captain/{id}")
  public Optional<Captain> getById(@PathVariable Integer id) {
    return captainService.findCaptainById(id);
  }
}
