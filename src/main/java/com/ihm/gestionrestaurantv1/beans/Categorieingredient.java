/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ihm.gestionrestaurantv1.beans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author BELAID
 */
@Entity
@Table(name = "categorieingredient")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categorieingredient.findAll", query = "SELECT c FROM Categorieingredient c"),
    @NamedQuery(name = "Categorieingredient.findById", query = "SELECT c FROM Categorieingredient c WHERE c.id = :id"),
    @NamedQuery(name = "Categorieingredient.findByDesignation", query = "SELECT c FROM Categorieingredient c WHERE c.designation = :designation")})
public class Categorieingredient implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "designation")
    private String designation;

    public Categorieingredient() {
    }

    public Categorieingredient(Integer id) {
        this.id = id;
    }

    public Categorieingredient(Integer id, String designation) {
        this.id = id;
        this.designation = designation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorieingredient)) {
            return false;
        }
        Categorieingredient other = (Categorieingredient) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ihm.gestionrestaurantv1.beans.Categorieingredient[ id=" + id + " ]";
    }
    
}
