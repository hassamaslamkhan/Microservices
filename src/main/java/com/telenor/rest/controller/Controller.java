/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.telenor.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hassam.aslam
 */
@RestController
public class Controller {
    
    @RequestMapping("/Index")
    public void Index(){
    
        System.out.println("working properly");
    }
    
    
    
}
