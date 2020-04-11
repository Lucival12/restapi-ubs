/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desafio.apirest.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Table(name = "unidade")
@Entity
public class Unidade implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private long id;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "vlr_latitude")
    private double vlrLatitude;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "vlr_longitude")
    private double vlrLongitude;

    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_munic")    
    private int codMunic;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_cnes")    
    private int codCnes;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "nom_estab")    
    private String nomEstab;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 56)
    @Column(name = "dsc_endereco")    
    private String dscEndereco;
    
    @Size(max = 20)
    @Column(name = "dsc_bairro")    
    private String dscBairro;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "dsc_cidade")    
    private String dscCidade;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 26)
    @Column(name = "dsc_telefone")
    private String dscTelefone;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 47)
    @Column(name = "dsc_estrut_fisic_ambiencia")
    private String dscEstrutFisicAmbiencia;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 47)
    @Column(name = "dsc_adap_defic_fisic_idosos")
    private String dscAdapDeficFisicIdosos;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 47)
    @Column(name = "dsc_equipamentos")
    private String dscEquipamentos;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 47)
    @Column(name = "dsc_medicamentos")
    private String dscMedicamentos;

    public Unidade() {
    }

    public Unidade(Integer id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getVlrLatitude() {
        return vlrLatitude;
    }

    public void setVlrLatitude(double vlrLatitude) {
        this.vlrLatitude = vlrLatitude;
    }

    public double getVlrLongitude() {
        return vlrLongitude;
    }

    public void setVlrLongitude(double vlrLongitude) {
        this.vlrLongitude = vlrLongitude;
    }

    public int getCodMunic() {
        return codMunic;
    }

    public void setCodMunic(int codMunic) {
        this.codMunic = codMunic;
    }

    public int getCodCnes() {
        return codCnes;
    }

    public void setCodCnes(int codCnes) {
        this.codCnes = codCnes;
    }

    public String getNomEstab() {
        return nomEstab;
    }

    public void setNomEstab(String nomEstab) {
        this.nomEstab = nomEstab;
    }

    public String getDscEndereco() {
        return dscEndereco;
    }

    public void setDscEndereco(String dscEndereco) {
        this.dscEndereco = dscEndereco;
    }

    public String getDscBairro() {
        return dscBairro;
    }

    public void setDscBairro(String dscBairro) {
        this.dscBairro = dscBairro;
    }

    public String getDscCidade() {
        return dscCidade;
    }

    public void setDscCidade(String dscCidade) {
        this.dscCidade = dscCidade;
    }

    public String getDscTelefone() {
        return dscTelefone;
    }

    public void setDscTelefone(String dscTelefone) {
        this.dscTelefone = dscTelefone;
    }

    public String getDscEstrutFisicAmbiencia() {
        return dscEstrutFisicAmbiencia;
    }

    public void setDscEstrutFisicAmbiencia(String dscEstrutFisicAmbiencia) {
        this.dscEstrutFisicAmbiencia = dscEstrutFisicAmbiencia;
    }

    public String getDscAdapDeficFisicIdosos() {
        return dscAdapDeficFisicIdosos;
    }

    public void setDscAdapDeficFisicIdosos(String dscAdapDeficFisicIdosos) {
        this.dscAdapDeficFisicIdosos = dscAdapDeficFisicIdosos;
    }

    public String getDscEquipamentos() {
        return dscEquipamentos;
    }

    public void setDscEquipamentos(String dscEquipamentos) {
        this.dscEquipamentos = dscEquipamentos;
    }

    public String getDscMedicamentos() {
        return dscMedicamentos;
    }

    public void setDscMedicamentos(String dscMedicamentos) {
        this.dscMedicamentos = dscMedicamentos;
    }    
    
}
