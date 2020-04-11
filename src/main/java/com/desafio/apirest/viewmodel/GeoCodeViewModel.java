package com.desafio.apirest.viewmodel;

import com.desafio.apirest.models.Unidade;

public class GeoCodeViewModel {
    
    private double latitude;
    
    private double longitude;

    
    public GeoCodeViewModel(Unidade unidade) {
        
        this.setLatitude(unidade.getVlrLatitude());
        this.setLongitude(unidade.getVlrLongitude());
        
    }
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    
}
