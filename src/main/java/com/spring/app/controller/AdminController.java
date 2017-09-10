package com.spring.app.controller;

import com.spring.app.model.Admin;
import com.spring.app.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/")
    public List<Admin> getAll(){
        return adminService.getAll();
    }

    @GetMapping("/{id}")
    public Admin getSingle(@PathVariable Long id){
        return adminService.getById(id);
    }

    @PostMapping("/add")
    public Admin add(@RequestBody Admin admin){
        return adminService.addNew(admin);
    }
}
