/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boarding.brdrsbllsys.dto;

/**
 *
 * @author dilin
 */
public class BoarderDto {
    private String name;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public BoarderDto() {
    }

    public BoarderDto(String name) {
        this.name = name;
       
    }
    
}
