package com.example.simple.simple.repository;

import com.example.simple.simple.entity.Captain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaptainRepository extends JpaRepository<Captain, Integer> {
}
