/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ihm.gestionrestaurantv1.facade;

import com.ihm.gestionrestaurantv1.beans.Plat;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author BELAID
 */
@Stateless
public class PlatFacade extends AbstractFacade<Plat> {
    @PersistenceContext(unitName = "com.ihm_GestionRestaurantV1.0_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PlatFacade() {
        super(Plat.class);
    }
    
}
