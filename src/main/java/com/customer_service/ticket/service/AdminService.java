package com.customer_service.ticket.service;

import com.customer_service.ticket.model.Admin;
import com.customer_service.ticket.repository.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final AdminRepository adminRepository;

    public Admin getAdminById(String id){
        return this.adminRepository.findById(id).orElse(null);
    }

    public List<Admin> getAllAdmins(){
        return this.adminRepository.findAll();
    }

    public Admin createAdmin(Admin admin){
        return this.adminRepository.save(admin);
    }

    public Admin updateAdmin(Admin admin){
        return this.adminRepository.save(admin);
    }

    public Admin deleteAdmin(String id){
        Optional<Admin> admin = this.adminRepository.findById(id);
        if (admin.isPresent()){
            this.adminRepository.deleteById(id);
            return admin.get();
        }
        return null;
    }
}
