/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.telenor.rest.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.CollectionId;

/**
 *
 * @author hassam.aslam
 */
@Entity
public class Employye implements Serializable 
{

  
    
@Id
private  int id;
@Column(length = 30)
private String name;
@Column(length = 30)
private String job;

public Employye(String name, String job) {
        this.name = name;
        this.job = job;
    }
  public Employye(int id, String name, String job) {
        this.id = id;
        this.name = name;
        this.job = job;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }


    
    
    
    
}
