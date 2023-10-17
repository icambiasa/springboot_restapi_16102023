package com.boniewijaya2021.springboot.entity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Setter
@Getter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "karyawan", schema = "sample")
public class Karyawan{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nama")
    private String nama;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "usia")
    private int usia;
    @Column(name = "gaji")
    private double gaji;
    @Column(name = "masa_kerja")
    private int masaKerja;


}

