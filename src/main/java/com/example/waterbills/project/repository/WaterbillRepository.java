package com.example.waterbills.project.repository;

import com.example.waterbills.project.model.Waterbill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaterbillRepository extends JpaRepository<Waterbill,Integer>{
}
