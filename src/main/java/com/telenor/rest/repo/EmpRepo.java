/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.telenor.rest.repo;

import com.telenor.rest.domain.Employye;
import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author hassam.aslam
 */

public interface EmpRepo extends  CrudRepository<Employye,Integer>{
 
}
