package com.spring.app.service;

import com.spring.app.model.Admin;
import com.spring.app.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> getAll(){
        return (List<Admin>) adminRepository.findAll();
    }

    public Admin getById(Long id){
        return adminRepository.findOne(id);
    }

    public Admin addNew(Admin admin){
        return adminRepository.save(admin);
    }
}
