/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ihm.gestionrestaurantv1.beans;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "plat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Plat.findAll", query = "SELECT p FROM Plat p"),
    @NamedQuery(name = "Plat.findById", query = "SELECT p FROM Plat p WHERE p.id = :id"),
    @NamedQuery(name = "Plat.findByNom", query = "SELECT p FROM Plat p WHERE p.nom = :nom"),
    @NamedQuery(name = "Plat.findByPrix", query = "SELECT p FROM Plat p WHERE p.prix = :prix"),
    @NamedQuery(name = "Plat.findByImage", query = "SELECT p FROM Plat p WHERE p.image = :image")})
public class Plat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prix")
    private float prix;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "image")
    private String image;
    @ManyToMany(mappedBy = "platList")
    private List<Ingredient> ingredientList;
    @JoinColumn(name = "idCategorie", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Categorieplat idCategorie;

    public Plat() {
    }

    public Plat(Integer id) {
        this.id = id;
    }

    public Plat(Integer id, String nom, float prix, String image) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @XmlTransient
    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public Categorieplat getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(Categorieplat idCategorie) {
        this.idCategorie = idCategorie;
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
        if (!(object instanceof Plat)) {
            return false;
        }
        Plat other = (Plat) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ihm.gestionrestaurantv1.beans.Plat[ id=" + id + " ]";
    }
    
}
