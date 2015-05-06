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
@Table(name = "serveur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Serveur.findAll", query = "SELECT s FROM Serveur s"),
    @NamedQuery(name = "Serveur.findById", query = "SELECT s FROM Serveur s WHERE s.id = :id"),
    @NamedQuery(name = "Serveur.findByIdZone", query = "SELECT s FROM Serveur s WHERE s.idZone = :idZone"),
    @NamedQuery(name = "Serveur.findByIdEmploye", query = "SELECT s FROM Serveur s WHERE s.idEmploye = :idEmploye"),
    @NamedQuery(name = "Serveur.findByNotation", query = "SELECT s FROM Serveur s WHERE s.notation = :notation")})
public class Serveur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idZone")
    private int idZone;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEmploye")
    private int idEmploye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "notation")
    private int notation;

    public Serveur() {
    }

    public Serveur(Integer id) {
        this.id = id;
    }

    public Serveur(Integer id, int idZone, int idEmploye, int notation) {
        this.id = id;
        this.idZone = idZone;
        this.idEmploye = idEmploye;
        this.notation = notation;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Serveur)) {
            return false;
        }
        Serveur other = (Serveur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ihm.gestionrestaurantv1.beans.Serveur[ id=" + id + " ]";
    }
    
}
