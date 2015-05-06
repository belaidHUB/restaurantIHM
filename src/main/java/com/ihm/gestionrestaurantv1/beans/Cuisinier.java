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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author BELAID
 */
@Entity
@Table(name = "cuisinier")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuisinier.findAll", query = "SELECT c FROM Cuisinier c"),
    @NamedQuery(name = "Cuisinier.findById", query = "SELECT c FROM Cuisinier c WHERE c.id = :id"),
    @NamedQuery(name = "Cuisinier.findByIdEmploye", query = "SELECT c FROM Cuisinier c WHERE c.idEmploye = :idEmploye"),
    @NamedQuery(name = "Cuisinier.findByNotation", query = "SELECT c FROM Cuisinier c WHERE c.notation = :notation"),
    @NamedQuery(name = "Cuisinier.findByNbrPlat", query = "SELECT c FROM Cuisinier c WHERE c.nbrPlat = :nbrPlat")})
public class Cuisinier implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEmploye")
    private int idEmploye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "notation")
    private int notation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nbrPlat")
    private int nbrPlat;

    public Cuisinier() {
    }

    public Cuisinier(Integer id) {
        this.id = id;
    }

    public Cuisinier(Integer id, int idEmploye, int notation, int nbrPlat) {
        this.id = id;
        this.idEmploye = idEmploye;
        this.notation = notation;
        this.nbrPlat = nbrPlat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(int idEmploye) {
        this.idEmploye = idEmploye;
    }

    public int getNotation() {
        return notation;
    }

    public void setNotation(int notation) {
        this.notation = notation;
    }

    public int getNbrPlat() {
        return nbrPlat;
    }

    public void setNbrPlat(int nbrPlat) {
        this.nbrPlat = nbrPlat;
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
        if (!(object instanceof Cuisinier)) {
            return false;
        }
        Cuisinier other = (Cuisinier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ihm.gestionrestaurantv1.beans.Cuisinier[ id=" + id + " ]";
    }
    
}
