/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yassar.peminjamanservice.service;

import com.yassar.peminjamanservice.VO.anggota;
import com.yassar.peminjamanservice.VO.ResponseTemplateVO;
import com.yassar.peminjamanservice.entity.peminjaman;
import com.yassar.peminjamanservice.repository.PeminjamanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
/**
 *
 * @author LENOVO
 */
@Service
public class PeminjamanService {
    @Autowired
    private PeminjamanRepository peminjamanRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public peminjaman savePeminjaman(peminjaman peminjaman){
        return peminjamanRepository.save(peminjaman);
    }
    
    public ResponseTemplateVO getPeminjaman(Long peminjamanId){
        ResponseTemplateVO vo = new ResponseTemplateVO();
        peminjaman peminjaman = 
                peminjamanRepository.findBypeminjamanId(peminjamanId);
        anggota anggota = 
        restTemplate.getForObject("http://localhost:9001/anggota/"
                + peminjaman.getAnggotaId(), anggota.class);
        vo.setPeminjaman(peminjaman);
        vo.setAnggota(anggota); 
        return vo;
    }
}
