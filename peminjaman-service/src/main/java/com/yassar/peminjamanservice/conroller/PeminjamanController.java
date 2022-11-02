/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yassar.peminjamanservice.conroller;

import com.yassar.peminjamanservice.VO.ResponseTemplateVO;
import com.yassar.peminjamanservice.entity.peminjaman;
import com.yassar.peminjamanservice.service.PeminjamanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author LENOVO
 */
@RestController
@RequestMapping("/peminjaman")
public class PeminjamanController {
    @Autowired
    private PeminjamanService peminjamanService;
    
    @PostMapping("/")
    public peminjaman savePeminjaman(@RequestBody peminjaman peminjaman){
        return peminjamanService.savePeminjaman(peminjaman);
    }
    
    @GetMapping("{id}")
    public ResponseTemplateVO getPeminjaman(@PathVariable("id") Long peminjamanId){
        return peminjamanService.getPeminjaman(peminjamanId);
    }
}
