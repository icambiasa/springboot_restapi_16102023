package com.boniewijaya2021.springboot.controller;
import com.boniewijaya2021.springboot.entity.Karyawan;
import com.boniewijaya2021.springboot.repository.KaryawanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/karyawan")
public class KaryawanController {
    @Autowired
    private KaryawanRepository karyawanRepository;

    @GetMapping
    public List<Karyawan> getAllKaryawan() {
        return (List<Karyawan>) karyawanRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Karyawan> getKaryawanById(@PathVariable Long id) {
        return karyawanRepository.findById(id);
    }

    @PostMapping
    public Karyawan createKaryawan(@RequestBody Karyawan karyawan) {
        return karyawanRepository.save(karyawan);
    }

    @DeleteMapping("/{id}")
    public void deleteKaryawan(@PathVariable Long id) {
        karyawanRepository.deleteById(id);
    }
}
