package com.customer_service.ticket.controller;

import com.customer_service.ticket.model.Admin;
import com.customer_service.ticket.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Admin")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;

    @GetMapping("/{id}")
    public Admin getAdminById(@PathVariable String id){
        return this.adminService.getAdminById(id);
    }

    @GetMapping("/all")
    public List<Admin> getAllAdmins(){
        return this.adminService.getAllAdmins();
    }
    @PostMapping
    public Admin createAdmin(@RequestBody Admin admin){
        return this.adminService.createAdmin(admin);
    }

    @PutMapping
    public Admin updateAdmin(@RequestBody Admin admin){
        return this.adminService.updateAdmin(admin);
    }

    @DeleteMapping("/{id}")
    public Admin deleteAdmin(@PathVariable String id){
        return this.adminService.deleteAdmin(id);
    }
}
