package com.example.waterbills.project.service;

import com.example.waterbills.project.model.Waterbill;
import com.example.waterbills.project.repository.WaterbillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaterbillServiceImpl implements WaterService{

    @Autowired
    private WaterbillRepository waterbillRepository;

    @Override
    public Waterbill saving(Waterbill waterbill) {
        return waterbillRepository.save(waterbill);
    }

    @Override
    public List<Waterbill> geting() {
        return waterbillRepository.findAll();
    }

    @Override
    public Waterbill updating(Waterbill waterbill) {
        return waterbillRepository.save(waterbill);
    }
}
