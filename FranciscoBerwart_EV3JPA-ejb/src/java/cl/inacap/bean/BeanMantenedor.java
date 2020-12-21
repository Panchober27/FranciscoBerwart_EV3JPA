/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.bean;

import cl.inacap.entity.Mantenedor;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author francisco
 */
@Stateless
public class BeanMantenedor implements BeanMantenedorLocal {
    
    @PersistenceContext(unitName = "FranciscoBerwart_EV3JPA-ejbPU")
    private EntityManager em;
    
    
    public void agregar(Object object) {
        em.persist(object);
    }
    
    public List<Mantenedor> getEmpleados(){
        return em.createQuery("select e from Mantenedor e").getResultList();
    }
    
}
