/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desafio.apirest.viewmodel;

import com.desafio.apirest.models.Unidade;


public class UnidadeViewModel {
    
    private long id;
    
    private String name;
    
    private String address;
    
    private String city;
     
    private String phone;    
    
    private GeoCodeViewModel geoCode;
    
    private ScoreViewModel scores;

    
    public UnidadeViewModel(Unidade unidade) {
        this.setName(unidade.getNomEstab());
        this.setAddress(unidade.getDscEndereco());
        this.setId(unidade.getId());
        this.setCity(unidade.getDscCidade());
        this.setPhone(unidade.getDscTelefone());
        this.setGeoCode(new GeoCodeViewModel(unidade));
        this.setScores(new ScoreViewModel(unidade));        
    }
    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public GeoCodeViewModel getGeoCode() {
        return geoCode;
    }

    public void setGeoCode(GeoCodeViewModel geoCode) {
        this.geoCode = geoCode;
    }

    public ScoreViewModel getScores() {
        return scores;
    }

    public void setScores(ScoreViewModel scores) {
        this.scores = scores;
    }

   
}
