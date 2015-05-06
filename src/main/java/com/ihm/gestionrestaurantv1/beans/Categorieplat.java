/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ihm.gestionrestaurantv1.beans;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author BELAID
 */
@Entity
@Table(name = "categorieplat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categorieplat.findAll", query = "SELECT c FROM Categorieplat c"),
    @NamedQuery(name = "Categorieplat.findById", query = "SELECT c FROM Categorieplat c WHERE c.id = :id"),
    @NamedQuery(name = "Categorieplat.findByDesignation", query = "SELECT c FROM Categorieplat c WHERE c.designation = :designation")})
public class Categorieplat implements Serializable {
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCategorie")
    private List<Plat> platList;

    public Categorieplat() {
    }

    public Categorieplat(Integer id) {
        this.id = id;
    }

    public Categorieplat(Integer id, String designation) {
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

    @XmlTransient
    public List<Plat> getPlatList() {
        return platList;
    }

    public void setPlatList(List<Plat> platList) {
        this.platList = platList;
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
        if (!(object instanceof Categorieplat)) {
            return false;
        }
        Categorieplat other = (Categorieplat) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ihm.gestionrestaurantv1.beans.Categorieplat[ id=" + id + " ]";
    }
    
}
