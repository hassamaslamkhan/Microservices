/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.telenor.rest.services;

import com.telenor.rest.domain.Employye;
import com.telenor.rest.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author hassam.aslam
 */
@Service
public class EmpService {
    private EmpRepo empRepo;
    @Autowired
    public EmpService(EmpRepo empRepo) {
        this.empRepo = empRepo;
    }  
    public Employye insertEmp(int id,String name ,String job)            
    {
        this.empRepo.save(new Employye(id,name,job));   
        return null;
    }
    public Iterable<Employye> findAll(){
    
        return empRepo.findAll();
    }
    public void print()
    {
        System.out.println("working");
    }    
}
