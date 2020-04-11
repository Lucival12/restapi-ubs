package com.desafio.apirest.viewmodel;

import com.desafio.apirest.models.Unidade;


public class ScoreViewModel {
    
    private String descriptionAmbiencePhysicalStructure;
    
    private String descriptionAdaptationHandicappedElderly;
    
    private String descriptionEquipament;
    
    private String descriptionMedicine;
    
    
    public ScoreViewModel(Unidade unidade) {
        
        this.setDescriptionAmbiencePhysicalStructure(unidade.getDscEstrutFisicAmbiencia());
        this.setDescriptionAdaptationHandicappedElderly(unidade.getDscAdapDeficFisicIdosos());
        this.setDescriptionEquipament(unidade.getDscMedicamentos());
        this.setDescriptionMedicine(unidade.getDscMedicamentos());
        
    }

    public String getDescriptionAmbiencePhysicalStructure() {
        return descriptionAmbiencePhysicalStructure;
    }

    public void setDescriptionAmbiencePhysicalStructure(String descriptionAmbiencePhysicalStructure) {
        this.descriptionAmbiencePhysicalStructure = descriptionAmbiencePhysicalStructure;
    }

    public String getDescriptionAdaptationHandicappedElderly() {
        return descriptionAdaptationHandicappedElderly;
    }

    public void setDescriptionAdaptationHandicappedElderly(String descriptionAdaptationHandicappedElderly) {
        this.descriptionAdaptationHandicappedElderly = descriptionAdaptationHandicappedElderly;
    }

    public String getDescriptionEquipament() {
        return descriptionEquipament;
    }

    public void setDescriptionEquipament(String descriptionEquipament) {
        this.descriptionEquipament = descriptionEquipament;
    }

    public String getDescriptionMedicine() {
        return descriptionMedicine;
    }

    public void setDescriptionMedicine(String descriptionMedicine) {
        this.descriptionMedicine = descriptionMedicine;
    }
    
   
}
