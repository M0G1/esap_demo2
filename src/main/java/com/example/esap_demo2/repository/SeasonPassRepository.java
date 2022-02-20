package com.example.esap_demo2.repository;

import com.example.esap_demo2.model.SeasonPass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeasonPassRepository extends JpaRepository<SeasonPass, Long> {
}
