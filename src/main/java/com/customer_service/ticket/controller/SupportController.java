package com.customer_service.ticket.controller;

import com.customer_service.ticket.model.Support;
import com.customer_service.ticket.service.SupportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/support")
@RequiredArgsConstructor
public class SupportController {
    private final SupportService supportService;

    @GetMapping("/{id}")
    public Support getSupportById(String id){
        return this.supportService.getSupportById(id);
    }

    @GetMapping("/all")
    public List<Support> getAllSupports(){
        return this.supportService.getAllSupports();
    }

    @PostMapping
    public Support createSupport(@RequestBody Support support){
        return this.supportService.createSupport(support);
    }

    @PutMapping
    public Support updateSupport(@RequestBody Support support){
        return this.supportService.updateSupport(support);
    }

    @DeleteMapping("/{id}")
    public Support deleteSupport(@PathVariable String id){
        return this.supportService.deleteSupport(id);
    }
}
