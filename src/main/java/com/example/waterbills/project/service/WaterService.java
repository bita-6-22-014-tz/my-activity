package com.example.waterbills.project.service;

import com.example.waterbills.project.model.Waterbill;

import java.util.List;

public interface WaterService {
    Waterbill saving(Waterbill waterbill);
    List<Waterbill> geting();
    Waterbill updating(Waterbill waterbill);

}
