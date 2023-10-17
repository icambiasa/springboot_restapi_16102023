package com.boniewijaya2021.springboot.repository;

import com.boniewijaya2021.springboot.entity.Karyawan;
import org.springframework.data.repository.CrudRepository;

public interface KaryawanRepository extends CrudRepository<Karyawan, Long> {
}

