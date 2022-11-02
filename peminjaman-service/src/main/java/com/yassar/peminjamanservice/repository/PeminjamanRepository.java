/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.yassar.peminjamanservice.repository;

import com.yassar.peminjamanservice.entity.peminjaman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author LENOVO
 */
@Repository
public interface PeminjamanRepository extends JpaRepository<peminjaman, Long> {
    
    public peminjaman findBypeminjamanId(Long peminjamanId);
    
}
