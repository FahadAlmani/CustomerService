package com.customer_service.ticket.service;

import com.customer_service.ticket.model.Support;
import com.customer_service.ticket.repository.SupportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SupportService {
    private final SupportRepository supportRepository;

    public Support getSupportById(String id){
        return this.supportRepository.findById(id).orElse(null);
    }

    public List<Support> getAllSupports(){
        return this.supportRepository.findAll();
    }

    public Support createSupport(Support support){
        return this.supportRepository.save(support);
    }

    public Support updateSupport(Support support){
        return this.supportRepository.save(support);
    }

    public Support deleteSupport(String id){
        Optional<Support> support = this.supportRepository.findById(id);
        if (support.isPresent()){
            this.supportRepository.delete(support.get());
            return support.get();
        }
        return null;
    }
}
