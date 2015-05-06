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
@Table(name = "tablette")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tablette.findAll", query = "SELECT t FROM Tablette t"),
    @NamedQuery(name = "Tablette.findById", query = "SELECT t FROM Tablette t WHERE t.id = :id"),
    @NamedQuery(name = "Tablette.findByIdZone", query = "SELECT t FROM Tablette t WHERE t.idZone = :idZone"),
    @NamedQuery(name = "Tablette.findByLibre", query = "SELECT t FROM Tablette t WHERE t.libre = :libre")})
public class Tablette implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idZone")
    private int idZone;
    @Basic(optional = false)
    @NotNull
    @Column(name = "libre")
    private boolean libre;

    public Tablette() {
    }

    public Tablette(Integer id) {
        this.id = id;
    }

    public Tablette(Integer id, int idZone, boolean libre) {
        this.id = id;
        this.idZone = idZone;
        this.libre = libre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdZone() {
        return idZone;
    }

    public void setIdZone(int idZone) {
        this.idZone = idZone;
    }

    public boolean getLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
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
        if (!(object instanceof Tablette)) {
            return false;
        }
        Tablette other = (Tablette) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ihm.gestionrestaurantv1.beans.Tablette[ id=" + id + " ]";
    }
    
}
